package EchoApplication1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSendsMessage {
    public static void main(String[] args) throws Exception {
        System.out.println("Server waiting for Client");

        ServerSocket ss = new ServerSocket(5555);//Server is waiting for clients to establish connection with them.//this statement creates a ServerSocket object, This object takes port number as input
        //This is the port number of server.
        // this binds the server socket object to that particular port number
        //This will throw exception...because if the port will not be available...use try&catch
        //this server socket will be waiting for incoming clients connections
        Socket host = ss.accept();
        //the accept method is a blocking call
//        //it will wait for incoming clients connections
//        //ss.accept() returns the object of the socket which is captured in Socket reference
        System.out.println("Connection established");

        DataInputStream datain = new DataInputStream(host.getInputStream());
        String rec = datain.readUTF();
        System.out.println(host.getInetAddress()+"\n"+rec);

        DataOutputStream dataout = new DataOutputStream(host.getOutputStream());
        dataout.writeUTF("Thank you i recived your message successfully \n"+"Your message was: "+rec);

        System.out.println("Closing Conncetion");


        //closing Conncetion

        host.close();
        dataout.close();
    }
}