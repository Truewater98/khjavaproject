package com.kh.day08.fivestone;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		char[][] board = new char[19][19];
		int numx = 0;
		int numy = 0;
		int turn = 0;
		boolean t = false;
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				board[i][j] = '*';
			}
		}
		Scanner sc = new Scanner(System.in);
		END:
			while (true) {
			System.out.print(" ");
			for (int k = 1; k < 20; k++) {
				System.out.printf("%2d", k);
			}
			System.out.println();
			for (int k = 0; k < 19; k++) {
				System.out.printf("%2d", k + 1);
				for (int m = 0; m < 19; m++) {
					System.out.print(board[k][m] + " ");
				}
				System.out.println("");
			}
			switch (turn % 2) {
			case 0:
				System.out.print("x좌표 값을 입력해주세요 : ");
				numx = sc.nextInt();
				System.out.print("y좌표 값을 입력해주세요 : ");
				numy = sc.nextInt();

				board[numx - 1][numy - 1] = 'o';
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2]
									&& board[i][j] == board[i][j + 3] && board[i][j] == board[i][j + 4];
							if (t == true) {
								System.out.print(" ");
								for (int k = 1; k < 20; k++) {
									System.out.printf("%2d", k);
								}
								System.out.println();
								for (int k = 0; k < 19; k++) {
									System.out.printf("%2d", k + 1);
									for (int m = 0; m < 19; m++) {
										System.out.print(board[k][m] + " ");
									}
									System.out.println("");
								}
								break END;
							}
						}
					}
				}
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j]
									&& board[i][j] == board[i + 3][j] && board[i][j] == board[i + 4][j];
							if (t == true) {
								System.out.print(" ");
								for (int k = 1; k < 20; k++) {
									System.out.printf("%2d", k);
								}
								System.out.println();
								for (int k = 0; k < 19; k++) {
									System.out.printf("%2d", k + 1);
									for (int m = 0; m < 19; m++) {
										System.out.print(board[k][m] + " ");
									}
									System.out.println("");
								}
								break END;
							}
						}
					}
				}
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2]
									&& board[i][j] == board[i + 3][j + 3] && board[i][j] == board[i + 4][j + 4];
							if (t == true) {
								System.out.print(" ");
								for (int k = 1; k < 20; k++) {
									System.out.printf("%2d", k);
								}
								System.out.println();
								for (int k = 0; k < 19; k++) {
									System.out.printf("%2d", k + 1);
									for (int m = 0; m < 19; m++) {
										System.out.print(board[k][m] + " ");
									}
									System.out.println("");
								}
								break END;
							}
						}
					}
				}
				turn++;
				break;
			case 1:
				System.out.print("x좌표 값을 입력해주세요 : ");
				numx = sc.nextInt();
				System.out.print("y좌표 값을 입력해주세요 : ");
				numy = sc.nextInt();

				board[numx - 1][numy - 1] = 'x';
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2]
									&& board[i][j] == board[i][j + 3] && board[i][j] == board[i][j + 4];
							if (t == true) {
								break END;
							}
						}
					}
				}
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j]
									&& board[i][j] == board[i + 3][j] && board[i][j] == board[i + 4][j];
							if (t == true) {
								break END;
							}
						}
					}
				}
				for (int i = 0; i < 19; i++) {
					for (int j = 0; j < 15; j++) {
						if (board[i][j] != '*') {
							t = board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2]
									&& board[i][j] == board[i + 3][j + 2] && board[i][j + 2] == board[i + 4][j + 2];
							if (t == true) {
								break END;
							}
						}
					}
				}
				turn++;
				break;
			}
		}
	}
}
