package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args){
		// 바이트 기반 스트림
		InputStream is = null;
		Reader reader = null;
		// 문자 기반 스트림
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 반드시 실행되어야 하는 코드 작성
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
