package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis =null;
		DataOutputStream dos = null;
		int port = 8509;
		int[] numbers = new int[3];
		Random rand = new Random();
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			//Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// ��ȣ 3���� ���� �Ŀ� ���� �غ��ؾ���
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;
				// �ߺ�����
				for(int j = 0; j < i; j++) {
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.println("���� ���� -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("���� �غ� �Ϸ�");
			while(true) {
				// �� �ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				// ���� ���� numbers�� ���� ������ ��
				// ���ڰ� �°� ��ġ�� �´���
				// ���ڰ� �°� ��ġ�� Ʋ����
				// �ƹ��͵� ���� �ʾҴ�����
				// ��Ʈ����ũ, ���� ������ش�.
				readNum = readNum.trim();
				int strike = 0;
				int ball = 0;
				String isNum = "";
				for(int i = 0; i < 3; i++) {	
					isNum += String.valueOf(numbers[i]);
				}
				for(int i = 0; i < 3; i++) {
					if(readNum.charAt(i) == isNum.charAt(i)) {
						strike++;
					}else {
						for(int j = 0; j < 3; j++) {
							if(readNum.charAt(i) == isNum.charAt(j)&& i != j) {
								ball++;
							}
						}
					}
				}
				System.out.println(strike + "��Ʈ����ũ " + ball + " ��");
				// Ŭ���̾�Ʈ�� ����� �����ֱ�!
				// ��Ʈ����ũ�� 3�̸� ���������ϱ�~
				if(strike == 3) {
					dos.writeUTF(strike + "��Ʈ����ũ " + ball + " ��, ��������");
				break;				
				}
				dos.writeUTF(strike + "��Ʈ����ũ " + ball + " ��");
			}
		} catch (IOException e) {
			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
	}

	private static void valueOf(String readNum) {
		// TODO Auto-generated method stub
		
	}
}
