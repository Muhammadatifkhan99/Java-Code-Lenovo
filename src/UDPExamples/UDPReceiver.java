package UDPExamples;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket host = new DatagramSocket(7777);
		byte [] buffer = new byte[1000];
		int length = buffer.length;
		
		DatagramPacket packet = new DatagramPacket(buffer, length);
		host.receive(packet);
		String str = new String(packet.getData());
		System.out.println(packet.getAddress()+" "+ str);
		
	}

}
