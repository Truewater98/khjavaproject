package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

import java.io.Writer;

public class Exam_write {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char[] data = "스프링&클라우드 웹 개발자 양성과정".toCharArray();
//			for(int i = 0; i < data.length; i++)
//			writer.write(data[i]);
			for(char a : data)
			writer.write(a);
			System.out.println("쓰기 완료");
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
