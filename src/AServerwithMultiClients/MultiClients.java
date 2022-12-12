package AServerwithMultiClients;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

class ClientHandlers extends Thread {
    Socket s;
    DataInputStream din;
    String str= "";
    ServerSocket svr;

    //constructor to initializ the objects by default
    public ClientHandlers (Socket ss,ServerSocket svrs){
        this.s=ss;
        this.svr=svrs;
    }

    //the run method to be executed by the thread
    public void run () {
        //the data input streams
        try {
            din = new DataInputStream(s.getInputStream());
            str = din.readUTF().toString();
            LocalDate date = LocalDate.now();
            //Handling files to which data is written
            File f = new File(date.toString() + ".txt");
            if (f.createNewFile()) {
                System.out.println("The file is created");
                //Writing the file to the external storage
                FileWriter rf = new FileWriter(date.toString() + ".txt");
                rf.write("\n" + str + " " + date.toString());
                rf.close();
            } else {
                LinkedList<String> lnlst = new LinkedList<String>();
                FileWriter rf = new FileWriter(date.toString() + ".txt", true);

                //Scaning input from keyboard

                Scanner mf = new Scanner(System.in);
                while (mf.hasNextLine()) {
                    lnlst.add(mf.nextLine());
                }
                boolean thereIs = false;
                for (String i : lnlst) {
                    if (i.contains(str)) {
                        System.out.println("Your are already marked :)");
                        thereIs = true;
                    }
                }
                if (thereIs = false) {
                    if (str.equals("Thank You")){
                        svr.close();
                    }
                }
                else {
                    rf.write("\n" + str + date);
                    rf.close();
                }
            }
            s.close();
            din.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
public class MultiClients {
    public static void main(String[] args) throws Exception {
        System.out.println("Server has started with the address:"+InetAddress.getLocalHost());
        ServerSocket sock = new ServerSocket(3456);
        while (true){
            Socket soc = sock.accept();
            System.out.println("Connection Established");
            ClientHandlers hc = new ClientHandlers(soc,sock);
            hc.start();
        }
    }
}
