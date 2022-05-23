package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket;
		try {
			socket = new Socket("192.168.0.11", 4444);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("전 잘 되는데");
			out.flush();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = in.readLine();
			System.out.println("클라이언트 : "+str+" 메시지 받음 from /192.168.0.17");
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //통신을 위해 소켓을 생성. //서버의 주소(IP)와 포트번호(서버와 동일한)
		//Socket socket = new Socket("192.168.0.7", 44444);
		
		
		
		
		
	}

}
