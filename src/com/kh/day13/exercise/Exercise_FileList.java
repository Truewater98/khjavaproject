package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {
	public static void listDirectory(File dir) {
		System.out.println("------" + dir.getPath() + "의 서브 리스트 입니다. ------");
		File[] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.print(fOne.getName());
			System.out.print("\t파일크기 : " + fOne.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", time, time, time, time);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:\\windows");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		listDirectory(f1);
	}
}
