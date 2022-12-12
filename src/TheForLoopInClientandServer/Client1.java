//This program is using a for loop to send only a limited numbers of messsages to the client....
//This is over TCP.....
package TheForLoopInClientandServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws Exception {
       Socket host = new Socket("localhost",5555);


        DataInputStream din = new DataInputStream(host.getInputStream());
        DataOutputStream  dout = new DataOutputStream(host.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        String messagetobesent = "";
        String str;
        for (int i=0;i<5;i++){
            dout.writeUTF(messagetobesent);

            str = din.readUTF();
            System.out.println(host.getInetAddress()+" "+str);

        }
        dout.close();
        host.close();
    }
}
