package com.kh.day13.socket_example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main (String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			// Unhandled exception type IOException, UnknownHostException
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("����Ϸ�");
			////////// ������ ������ ////////////////
			byte[] buf = null;
			String message = "";
			message = "Hello Server";
			os = socket.getOutputStream();
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			////////////////////////////////////////
			
			///////// ������ �ޱ� //////////////////
			is = socket.getInputStream();
			buf = new byte[100];
			int bytesNo = is.read(buf);
			message = new String(buf, 0, bytesNo);
			System.out.println("�Է¹��� �޼��� : " + message);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
