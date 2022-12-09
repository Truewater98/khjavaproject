package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis =null;
		DataOutputStream dos = null;
		int port = 8509;
		int[] numbers = new int[3];
		Random rand = new Random();
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			//Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 번호 3개를 뽑은 후에 게임 준비해야함
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;
				// 중복제거
				for(int j = 0; j < i; j++) {
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.println("서버 숫자 -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("서버 준비 완료");
			while(true) {
				// 값 받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				// 받은 값이 numbers의 값과 비교했을 때
				// 숫자가 맞고 위치도 맞는지
				// 숫자가 맞고 위치도 틀린지
				// 아무것도 맞지 않았는지를
				// 스트라이크, 볼로 출력해준다.
				readNum = readNum.trim();
				int strike = 0;
				int ball = 0;
				String isNum = "";
				for(int i = 0; i < 3; i++) {	
					isNum += String.valueOf(numbers[i]);
				}
				for(int i = 0; i < 3; i++) {
					if(readNum.charAt(i) == isNum.charAt(i)) {
						strike++;
					}else {
						for(int j = 0; j < 3; j++) {
							if(readNum.charAt(i) == isNum.charAt(j)&& i != j) {
								ball++;
							}
						}
					}
				}
				System.out.println(strike + "스트라이크 " + ball + " 볼");
				// 클라이언트로 결과값 보내주기!
				// 스트라이크가 3이면 게임종료하기~
				if(strike == 3) {
					dos.writeUTF(strike + "스트라이크 " + ball + " 볼, 게임종료");
				break;				
				}
				dos.writeUTF(strike + "스트라이크 " + ball + " 볼");
			}
		} catch (IOException e) {
			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
	}

	private static void valueOf(String readNum) {
		// TODO Auto-generated method stub
		
	}
}
