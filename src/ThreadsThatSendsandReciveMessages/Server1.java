package ThreadsThatSendsandReciveMessages;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
    public static void main (String [] args)throws Exception{
        System.out.println("Server has started");
        ServerSocket sock = new ServerSocket(5555);
        Socket host = sock.accept();
        System.out.println("Connection Established");
        DataOutputStream dout = new DataOutputStream(host.getOutputStream());
        DataInputStream din   = new DataInputStream(host.getInputStream());

        Scanner scan = new Scanner(System.in);

        String str;

        Thread reader = new Thread(){
            public void run(){
                String str = "";
                while (!str.equals("stop")){
                    try {
                        str = din.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(host.getInetAddress()+" "+str);

                }
            }

        };
        Thread writer = new Thread(){
            public void run(){
                String str = "";
                while(!str.equals("stop")){
                    str = scan.nextLine();
                    try {
                        dout.writeUTF(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        reader.start();
        writer.start();


        reader.join();
        writer.join();

        host.close();
        sock.close();
    }
}
