package FactorialServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Client has started");
        Socket s = new Socket("localhost",5555);
        //let take in input from the keyboard
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number entered is:"+num);

        //as a cllient we will send a number to the server and the server will performe the calculation on it..
        DataOutputStream dataout = new DataOutputStream(s.getOutputStream());
        dataout.writeUTF(String.valueOf(num)); //this will sends the number to the server

        DataInputStream datain = new DataInputStream(s.getInputStream());
        System.out.println("The factorial returned from the server is:"+datain.readUTF());
    }
}
