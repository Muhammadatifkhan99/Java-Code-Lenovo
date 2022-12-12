//This program is using a for loop to send only a limited numbers of messsages to the client....
//This is over TCP.....
package TheForLoopInClientandServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
    public static void main (String [] args) throws Exception {
        ServerSocket sock = new ServerSocket(5555);
        Socket host = sock.accept();
        System.out.println("Conncection Established");
        DataInputStream datain = new DataInputStream(host.getInputStream());

        DataOutputStream dataout = new DataOutputStream(host.getOutputStream());

        Scanner scan = new Scanner(System.in);
        String str;
        String messagetobesent;

        for(int i=1;i<5;i++){
            str = datain.readUTF();
            System.out.println(host.getInetAddress()+" "+str);
            messagetobesent = scan.nextLine();
            dataout.writeUTF(messagetobesent);
        }
        host.close();
        sock.close();
    }
}
