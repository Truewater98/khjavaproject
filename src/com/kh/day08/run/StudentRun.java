package com.kh.day08.run;

public class StudentRun {
	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		EXIT :
		while(true) {
			int choice = sFunc.printMenu();
			switch(choice) {
			case 1 : 
				sFunc.inputScore();
				break;
			case 2 : 
				sFunc.printScore();
				break;
			case 3 : 
				sFunc.checkPass();
				break;
			case 4 : break EXIT;
			default :
				sFunc.printException();
			}
		}
	}

}
