package AServerwithMultiClients;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("localhost",3456);

        //Datainput streams
        DataOutputStream douts = new DataOutputStream(sock.getOutputStream());
        douts.writeUTF("Name: Muhammad Atif"+"\n"+"Roll No.:12");


//        closing connections

        douts.close();
        sock.close();
    }
}
