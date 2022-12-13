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
//		1. 정보입력
//		2. 정보출력
//		3. 정보저장(save)
//		4. 정보불러오기(load)
//		0. 종료
//		메뉴입력 : 1
//		1.
//		이름 입력 : 일용자
//		나이 입력 : 13
//		주소 입력 : 서울시 종로구
//		2.
//		이름 : 일용자
//		나이 : 33
//		주소 : 서울 종로구
//		3 선택하여 저장 후 파일을 열어보면 일용자/33/서울시 종로구 단, 파일 이름은 이름으로 한다
//		4. 선택후 파일의 제목을 입력하여 로드한 후에
//		2. 선택하면 정보가 출력됨
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
		System.out.println("정보를 " + person.getName() + "파일의 저장했습니다.");
	}catch (IOException e) {
		e.printStackTrace();
	}
}
public void load() {
//	Reader reader;
//	BufferedReader bfReader;
//	String result = "";
//	System.out.print("불러올 파일을 입력해주세요 : ");
//	String filename = sc.next();
	try {
		int length = 0;
		System.out.print("파일의 제목을 입력 : ");
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
		System.out.println(person.getName() + "파일의 정보를 불러왔습니다.");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void insert() {
	System.out.print("이름 입력 : ");
	person.setName(sc.next());
	System.out.print("나이 입력 : ");
	person.setAge(sc.nextInt());
	sc.nextLine();
	System.out.print("주소 입력 : ");
	person.setAddress(sc.nextLine());
	
}
public int menuPrint() {
	System.out.println("1. 정보입력");
	System.out.println("2. 정보 출력");
	System.out.println("3. 정보 저장(save 후 입력받은 이름이 파일명)");
	System.out.println("4. 정보불러오기(load후 2번으로 출력)");
	System.out.println("0. 종료하기");
	System.out.print("메뉴입력 : ");
	return sc.nextInt();
}

public void print() {
	System.out.println("이름 : " + person.getName());
	System.out.println("나이 : " + person.getAge());
	System.out.println("주소 : " + person.getAddress());
}

}
 
