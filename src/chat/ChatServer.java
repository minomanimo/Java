package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serversocket = new ServerSocket(1234);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class SenderThread extends Thread{
	PrintWriter pw;
	public void run() {
		pw = new PrintWriter(socket)
	}
}