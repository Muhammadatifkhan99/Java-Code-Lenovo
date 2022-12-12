package FactorialServer;

import javax.naming.ldap.SortKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FServer {
    public static void main(String[] args) throws Exception{
        System.out.println("Server has started");
        ServerSocket s = new ServerSocket(5555);
        Socket soc = s.accept();
        System.out.println("Connection Established");

        //Now Reading number on the server side

        DataInputStream datain = new DataInputStream(soc.getInputStream());
        int inp = Integer.parseInt(datain.readUTF());
        System.out.println("The input recived is: "+ inp);

        DataOutputStream dataout = new DataOutputStream(soc.getOutputStream());
        dataout.writeUTF(String.valueOf(calculateFoctorial(inp)));

}
    static int calculateFoctorial(int num){
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact = fact *i;
        }
        return fact;
    }
}
