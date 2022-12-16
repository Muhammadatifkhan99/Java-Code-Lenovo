package UDPExamples;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class Sender1 {

	public static void main(String[] args) throws Exception{
	
		DatagramSocket host = new DatagramSocket(8888);
		String msg = "Hello this is the data we are sending using packets";
		byte [] data = msg.getBytes();
		int length = data.length;
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		int port = 7777;
		DatagramPacket packet = new DatagramPacket(data, length, ip, port);

		host.send(packet);
	}

}
