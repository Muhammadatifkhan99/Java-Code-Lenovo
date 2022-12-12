package ThreadsThatSendsandReciveMessages;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception{
        Socket sock = new Socket("localhost",5555);
        System.out.println("Connection Established");

        //Data input Streams
        DataInputStream din = new DataInputStream(sock.getInputStream());
        //Data Output Streams
        DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
        //Scanncer class for input
        Scanner scan = new Scanner(System.in);

        String messageToBeSent;

        //Anonymous class for starting reader Thread
        Thread reader = new Thread(){
            public void run(){
                String str = "";
                while (!str.equals("Stop")){
                    try {
                        str=din.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(sock.getInetAddress()+" "+str);
                }

            }
        };
        //Anonymous writer class for sending message
        Thread writer = new Thread() {
            public void run() {
                String str = "";
                while (!str.contains("stop")){
                    str = scan.nextLine();
                    try {dout.writeUTF(str);}
                    catch (IOException e) {	e.printStackTrace();}
                }
            }
        };
        reader.start();
        writer.start();

        //we must makes the threads waits for execution of other threads
        reader.join();
        writer.join();


        dout.close();
        sock.close();


    }
}
