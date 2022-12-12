//package TCPExamples;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Server1 {
//    public static void main(String[] args) throws Exception{
//        System.out.println(InetAddress.getLocalHost());
//        ServerSocket s1 = new ServerSocket(5555);
//        Socket host = s1.accept();
//        System.out.println("Connection Established Successfully");
//
//        DataInputStream Is = new DataInputStream(host.getInputStream());
////        String str = d2.readUTF();
//        System.out.println(host.getInetAddress()+"\n"+Is.readUTF());
//        //this is a dataoutput stream that will be send by the server ot the clients
//        DataOutputStream Os = new DataOutputStream(host.getOutputStream());
//        Os.writeUTF("Thank You"+ Is.readUTF()+" message recived");
//        host.close();
//        s1.close();
//    }
//}
package TCPExamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

    public static void main(String[] args) throws Exception{

        System.out.println(InetAddress.getLocalHost());
        ServerSocket sock = new ServerSocket(5555);
        Socket host = sock.accept();

        System.out.println("Connection Established");


        DataInputStream din =
                new DataInputStream(host.getInputStream());
        String str = din.readUTF();
        System.out.println(host.getInetAddress()+" " +str);

        DataOutputStream dout =
                new DataOutputStream(host.getOutputStream());
        dout.writeUTF("Thank you "+str+  " message Received");

        host.close();
        sock.close();



    }

}
