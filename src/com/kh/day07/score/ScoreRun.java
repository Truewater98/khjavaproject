package com.kh.day07.score;



public class ScoreRun {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		ScoreFunction sFunc = new ScoreFunction(); 
		// 무한 반복에 포함하지 말아요
		ByeBye:
		while (true) {
			int choice = sFunc.printMenu();
			switch (choice) {
			case 1:
				sFunc.inputScore();
				break;
			case 2:
				sFunc.printScore();
				break;
			case 3:
				sFunc.goodbyeMsg();
				break ByeBye;
			default:
				sFunc.exceptionMsg();
				
			}
		}
	}

}
