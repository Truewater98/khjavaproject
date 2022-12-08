package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void filecopy() {

		// �̹��� ���� ����
		// C:\\img\\moomeokpan.png -> D:\\moomeok.png
		// ����Ʈ ��� �Է½�Ʈ��
		InputStream is = null;
		OutputStream os = null;
		
		
		try {
			is = new FileInputStream("C:\\img\\moomeokpan.png");
			os = new FileOutputStream("D:\\moomeok.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) { //���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		sc.nextLine();
		int count = 1;
		try {
			writer = new FileWriter("C:\\img\\" + fileName);
			String input = "";
			System.out.println("'" + fileName + "'' ���Ͽ� ����� ���� �Է� : " );
			System.out.println("����� exit");
			while(true) {				
				System.out.print(count + " : ");
				input = sc.nextLine();
				if("exit".equals(input)) break;
				writer.write(input + "\n");					
				count++;
		}
			System.out.println("���� ���� �Ϸ� (exit�� �����ϰ� ����)");
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

