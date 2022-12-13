package com.kh.day14.exercise;

import java.io.BufferedReader;
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
import java.util.StringTokenizer;

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
	Person person;
	public Exercise_IOStream() {
		person = new Person();
	}	
	Writer write = null;
	Reader read = null;
	private char[] cbuf = new char[100];
    private String readInfo = "";
    private String[] infos;
    private String fileName = "";
    Scanner sc = new Scanner(System.in);
public void save() {
	try {
		write = new FileWriter("src/exercise/" + person.getName() + ".txt");
		String writ = person.getName() + "/" + person.getAge() + "/" + person.getAddress();
		write.write(writ);
		write.flush();
		System.out.println("������ " + person.getName() + "������ �����߽��ϴ�.");
	}catch (IOException e) {
		e.printStackTrace();
	}
}
public void load() {
//	Reader reader;
//	BufferedReader bfReader;
//	String result = "";
//	System.out.print("�ҷ��� ������ �Է����ּ��� : ");
//	String filename = sc.next();
	try {
		int length = 0;
		System.out.print("������ ������ �Է� : ");
		sc.nextLine();
		fileName = sc.nextLine();
		read = new FileReader("src/exercise/" + fileName + ".txt");
		length = read.read(cbuf);
		readInfo = String.valueOf(cbuf, 0, length);
		infos = readInfo.split("/");
		person.setName(infos[0]);
		person.setAge(Integer.parseInt(infos[1]));
		person.setAddress(infos[2]);
//		reader = new FileReader("src/exercise/" + filename + ".txt");
//		bfReader = new BufferedReader(reader);
//		result = bfReader.readLine();	
//		StringTokenizer st = new StringTokenizer(result,"/");
//		name = st.nextToken();
//		age = Integer.parseInt(st.nextToken());
//		address = st.nextToken();
		System.out.println(person.getName() + "������ ������ �ҷ��Խ��ϴ�.");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void insert() {
	System.out.print("�̸� �Է� : ");
	person.setName(sc.next());
	System.out.print("���� �Է� : ");
	person.setAge(sc.nextInt());
	sc.nextLine();
	System.out.print("�ּ� �Է� : ");
	person.setAddress(sc.nextLine());
	
}
public int menuPrint() {
	System.out.println("1. �����Է�");
	System.out.println("2. ���� ���");
	System.out.println("3. ���� ����(save �� �Է¹��� �̸��� ���ϸ�)");
	System.out.println("4. �����ҷ�����(load�� 2������ ���)");
	System.out.println("0. �����ϱ�");
	System.out.print("�޴��Է� : ");
	return sc.nextInt();
}

public void print() {
	System.out.println("�̸� : " + person.getName());
	System.out.println("���� : " + person.getAge());
	System.out.println("�ּ� : " + person.getAddress());
}

}
 
