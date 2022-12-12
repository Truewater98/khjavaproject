package com.kh.day14.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
//		1. �����Է�
//		2. �������
//		3. ��������(save)
//		4. �����ҷ�����(load)
//		0. ����
//		�޴��Է� : 1
//		1.
//		�̸� �Է� : �Ͽ���
//		���� �Է� : 13
//		�ּ� �Է� : ����� ���α�
//		2.
//		�̸� : �Ͽ���
//		���� : 33
//		�ּ� : ���� ���α�
//		3 �����Ͽ� ���� �� ������ ����� �Ͽ���/33/����� ���α� ��, ���� �̸��� �̸����� �Ѵ�
//		4. ������ ������ ������ �Է��Ͽ� �ε��� �Ŀ�
//		2. �����ϸ� ������ ��µ�
	Writer write = null;
	Reader read = null;
    private	String name = "";
    private String address = "";
    private int age = 0;
	private char[] cbuf = new char[100];
    private String readInfo = "";
    private String[] infos;
    private String fileName = "";
    Scanner sc = new Scanner(System.in);
public void save() {
	try {
		write = new FileWriter("src/exercise/" + name + ".txt");
		String writ = name + "/" +  age + "/" + address;
		write.write(writ);
		write.flush();
		System.out.println("������ " + name + "������ �����߽��ϴ�.");
	}catch (IOException e) {
		e.printStackTrace();
	}
}
public void load() {
	try {
		int length = 0;
		System.out.print("������ ������ �Է� : ");
		sc.nextLine();
		fileName = sc.nextLine();
		read = new FileReader("src/exercise/" + fileName + ".txt");
		length = read.read(cbuf);
		readInfo = readInfo.valueOf(cbuf, 0, length);
		infos = readInfo.split("/");
		name = infos[0];
		age = Integer.parseInt(infos[1]);
		System.out.println(infos[2]);
		address = infos[2];
		System.out.println(name + "������ ������ �ҷ��Խ��ϴ�.");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void insert() {
	System.out.print("�̸� �Է� : ");
	name = sc.next();
	System.out.print("���� �Է� : ");
	age = sc.nextInt();
	sc.nextLine();
	System.out.print("�ּ� �Է� : ");
	address = sc.nextLine();
	
}
public int menuPrint() {
	System.out.println("1. �����Է�");
	System.out.println("2. ���� ���");
	System.out.println("3. ���� ����(save)");
	System.out.println("4. �����ҷ�����(load)");
	System.out.println("0. ����");
	System.out.print("�޴��Է� : ");
	return sc.nextInt();
}

public void print() {
	System.out.println("�̸� : " + name);
	System.out.println("���� : " + age);
	System.out.println("�ּ� : " + address);
}

}
 
