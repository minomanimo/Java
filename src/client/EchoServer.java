package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(4444);
			System.out.println("서버시작.");
			
			while(true) {
				Socket socket=serverSocket.accept();
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"EUC_KR"));
				String str = in.readLine();
				System.out.println("서버 : "+str+" 메시지 받음");
				
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println(str);
				out.flush();
//				break;
			}
//			System.out.println("서버 종료.");
//			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
