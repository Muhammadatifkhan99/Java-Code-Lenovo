package AServerwithMultiClients;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("10.48.164.197",3456);

        //Datainput streams
        DataOutputStream douts = new DataOutputStream(sock.getOutputStream());
        douts.writeUTF("Muhammad Atif 12");


//        closing connections

        douts.close();
        sock.close();
    }
}
