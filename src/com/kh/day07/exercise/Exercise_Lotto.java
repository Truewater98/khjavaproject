package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void Lotto() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기!!
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 몇개? 6개!!
		// 로또 번호의 범위는? 1 ~ 45
		Random rand = new Random();
		int[] nums = new int[6];
		int temp = 0;
		// 번호를 뽑는다. X6
		for (int i = 0; i < nums.length; i++) {
			// 번호를 뽑는다.
			// 1 ~ 45 - > 0 ~ 44 - > 1 ~ 45
			nums[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				// 비교를 한다. 점점 많아진다.
				// 비교는 이미뽑은 것과 첫번째부터~
			if(nums[i] == nums [j]) {
				// 같으면 i--
                  i--;
			      break;
			}
			}
		}
		
		for (int i = 0; i <nums.length -1 ; i++) {
			for(int j = 0; j < nums.length - 1 -i; j++) {
				if(nums[j + 1] < nums[j]) {
				temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
