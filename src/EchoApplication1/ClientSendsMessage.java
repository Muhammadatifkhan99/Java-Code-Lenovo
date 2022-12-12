//This program simply establishes a connection with a client and server
package EchoApplication1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendsMessage {
    public static void main(String[] args) throws Exception{
        System.out.println("Client Started");

        //Create a Socket Object
        Socket host = new Socket("localhost",5555);//This will take in two perameters i)is ip address and second isn the port number
        //local host because both clients and the server are on the same machine

        //Streams
        //Will be sending data in streams accross the network, Streams are used for writing and reading data
        //there are two types of stream
        //i) input stream for reading data and another is output stream for writing data or sending data..

        //STREAMS
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("The string is: "+str);

        //output Streams
        DataOutputStream dataout = new DataOutputStream(host.getOutputStream());
        dataout.writeUTF(str);

        //InputStreams
        DataInputStream datain = new DataInputStream(host.getInputStream());
        System.out.println(datain.readUTF());

        //Closeing Connection
        dataout.close();
        host.close();

    }
}
