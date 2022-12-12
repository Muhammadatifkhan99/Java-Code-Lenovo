//This program simply establishes a connection with a client and server
package EchoApplication;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Server waiting for Client");

        ServerSocket ss = new ServerSocket(5555);//Server is waiting for clients to establish connection with them.//this statement creates a ServerSocket object, This object takes port number as input
         //This is the port number of server.
        // this binds the server socket object to that particular port number
        //This will throw exception...because if the port will not be available...use try&catch
        //this server socket will be waiting for incoming clients connections
        Socket sock = ss.accept();
        //the accept method is a blocking call
//        //it will wait for incoming clients connections
//        //ss.accept() returns the object of the socket which is captured in Socket reference
        System.out.println("Connection established");

    }
}

//public class EchoServer {
//    public static void main(String [] args) throws Exception{
//
//
//        System.out.println("Server is waiting for the clients");
//
//        ServerSocket ss = new ServerSocket(5555); //this statement creates a ServerSocket object, This object takes port number as input
//
//
//        Socket soc = ss.accept();
//        System.out.println("Connection established");
//
//    }
//}
