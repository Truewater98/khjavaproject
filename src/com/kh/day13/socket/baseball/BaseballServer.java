package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		
		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			Date date = new Date();
			System.out.println(trans.format(date));
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
    //				readNum = readNum.trim();
				int strike = 0;
				int ball = 0;
				// 3 7 5
				// 1. �迭�� �迭�� �� numbers�� int �迭�̶�
				// �Է¹��� ���� ���ڰ� ����Ǵ� �迭�� ����(split() ���)
				String[] readNums = readNum.split(" ");
				for(int i = 0; i < numbers.length; i ++) {
					for(int e = 0; e < readNums.length; e++) {
						if(numbers[i] == Integer.parseInt(readNums[e])) {
							// ���� ���� ������ �񱳸� ��.
							// �׸��� ��ġ�� ������ �񱳸� ��.
						if(i == e) {
							strike++;
						}else {
							ball++;
						}
						}
					}
				}
    //				String isNum = "";
    //				for(int i = 0; i < 3; i++) {	
    //					isNum += String.valueOf(numbers[i]);
    //				}
    //				for(int i = 0; i < 3; i++) {
    //					if(readNum.charAt(i) == isNum.charAt(i)) {
    //						strike++;
    //					}else {
    //						for(int j = 0; j < 3; j++) {
    //							if(readNum.charAt(i) == isNum.charAt(j)&& i != j) {
    //								ball++;
    //							}
    //						}
    //					}
    //				}
				String result = strike + "��Ʈ����ũ " + ball + " ��";
				System.out.println(result);
				// Ŭ���̾�Ʈ�� ����� �����ֱ�!
				// ��Ʈ����ũ�� 3�̸� ���������ϱ�~
				if(strike == 3) {
					dos.writeUTF(result + ", ��������");
				break;				
				}
				dos.writeUTF(result);
			}
		} catch (/*IO*/Exception e) {
			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
		}finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void valueOf(String readNum) {
		
	}
}
