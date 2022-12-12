//This program simply establishes a connection with a client and server
package EchoApplication;

import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws Exception{
        System.out.println("Client Started");

        //Create a Socket Object
        Socket sock = new Socket("localhost",5555);//This will take in two perameters i)is ip address and second isn the port number
        //local host because both clients and the server are on the same machine
    }
}
