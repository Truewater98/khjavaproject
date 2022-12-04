package com.kh.day08.fivestone;

import java.util.Scanner;

public class Run_ {
	public static void main(String[] args) {
		FiveStoneFunction NG;
		NG = new FiveStoneFunction();
		int count = 0;
		int option = 0;
		Scanner sc = new Scanner(System.in);
		Player[] player = new Player[2];
		player[0] = new Player();
		player[1] = new Player();
		player[0].SetMal('o');
		player[1].SetMal('x');
		while(true) {
			System.out.println("======= 메뉴 ======");
			System.out.println("1. 말 설정");
			System.out.println("2. 게임 시작");
			System.out.println("3. 전적 출력");
			option = sc.nextInt();
			switch(option) {
			case 1 :
				System.out.println("설정을 변경 할 말 설정");
				System.out.println("1. player1 말 표시변경");
				System.out.println("2. plater2 말 표시변경");
				option = sc.nextInt();
				switch(option) {
				case 1 : 
					while(true){
						System.out.print("표시될 알파벳을 입력해주세요 : ");
						char a = sc.next().charAt(0);
						if(a == player[1].GetMal()) {
							System.out.println("player2 말과 겹칩니다. 다시입력해주세요");
						}else {
							player[0].SetMal(a);
							break;
						}
					}
			         break;
				case 2 : 
					while(true){
						System.out.print("표시될 알파벳을 입력해주세요 : ");
						char a = sc.next().charAt(0);
						if(player[0].GetMal() == a) {
							System.out.println("player1 말과 겹칩니다. 다시입력해주세요");
						}else {
							player[1].SetMal(a);
							break;
						}						
					}
				}
				break;
			    case 3 : 
			        System.out.println("player1 전적"); 
			    	player[0].ShowLate();
			    	System.out.println("player2 전적");
			        player[1].ShowLate();
			        break;
			case 2 : 
				END:
					while (true) {
						NG.printBoard();
						switch (count % 2) {
						case 0:
							System.out.println("player1 차례");
							if(NG.input(player[0].GetMal())) {
								NG.victory();
								if (NG.victory()) {
									NG.printBoard();
									System.out.println("player1 승리");
									player[0].upWin();
									player[1].uplose();
									break END;
								}
								count++;
								break;						
							}
							else {
								System.out.println("이미 둔곳입니다. 다시두세요");
								break;
							}
						case 1:
							System.out.println("player2 차례");
							if(NG.input(player[1].GetMal())) {
								System.out.println(NG.victory());
								if (NG.victory()) {
									NG.printBoard();
									System.out.println("player2 승리");
									player[1].upWin();
									player[0].uplose();
									break END;
								}
								count++;
								break;								
							}
							else {
								System.out.println("이미 둔곳입니다. 다시두세요");
							     break;
							}
						}
						
					}
				break;
			}
		}
			
		}

}
