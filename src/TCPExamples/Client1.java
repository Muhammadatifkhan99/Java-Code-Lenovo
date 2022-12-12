//package TCPExamples;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.net.Socket;
//
//public class Client1 {
//    public static void main(String[] args) throws Exception{
//        Socket host = new Socket("127.0.0.1",5555);
//        //This stream is sending data to the server we created in server1 file
//        DataOutputStream Os = new DataOutputStream(host.getOutputStream());
//        //This method will write the message in double qoutes to the server...
//        Os.writeUTF("Iam a client sending this message to the server");
//        //Now we have to recive input from the server...
//        //that is reading data from server
//        DataInputStream Is = new DataInputStream(host.getInputStream());
//        System.out.println(Is.readUTF());
//        //now we have to close the connection after communication
//        //1--->Stop sending inputstream to server
//        Os.close();
//        //2--->stop communication with server
//        host.close();
//
//    }
//}
package TCPExamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

    public static void main(String[] args) throws Exception {

        Socket host = new Socket("127.0.0.1",5555);


        DataOutputStream dout =
                new DataOutputStream(host.getOutputStream());
        dout.writeUTF("Haseeb");


        DataInputStream din =
                new DataInputStream(host.getInputStream());
        System.out.println(din.readUTF());

        dout.close();
        host.close();

    }

}
