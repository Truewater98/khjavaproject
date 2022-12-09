package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			System.out.println("채팅서버를 구동 중입니다....");
			// Unhandled exception type InterruptedException
			Thread.sleep(2000); // 2초 지연
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다!");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			// 보내기
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
//				byte[] bytes = sendMsg.getBytes();
//				os.write(bytes);
				dos.writeUTF(sendMsg);
				// 받기
//				bytes = new byte[100];
//				int readNo = is.read(bytes);
//				String recvMsg = new String(bytes,0,readNo);
				String recvMsg = dis.readUTF();
				System.out.println("클라이언트(상대): " + recvMsg);	
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
