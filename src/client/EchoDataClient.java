package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class EchoDataClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf = "lol".getBytes();
		DatagramSocket socket;
		try {
			socket = new DatagramSocket();
			InetAddress address = InetAddress.getByName("192.168.0.18");
			
			DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4465);
			
			socket.send(packet);
			packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			
			String received = new String (packet.getData(), 0, packet.getLength());
			System.out.println("클라이언트 받은 메세지 : "+received);
			
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
