package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis =null;
		DataOutputStream dos = null;
		String address = "127.0.0.1";
		int port = 8509;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address,port);
			System.out.println("클라이언트 소켓을 생성");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("게임 준비 완료");
			while(true) {
				// 값 보내기
				System.out.print("-->");
				String input = sc.nextLine();
				dos.writeUTF(input);
				String info = dis.readUTF();
				System.out.println(info);
				if(info.contains("게임종료")) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
