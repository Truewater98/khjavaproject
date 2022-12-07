package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
            byte[] data = "Hello I/O".getBytes();
            for(byte y : data) {
            	System.out.print(y + " ");
            	os.write(y);
            }
			//os.write(data[0]);
			os.flush();
			System.out.println("쓰기완료!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
