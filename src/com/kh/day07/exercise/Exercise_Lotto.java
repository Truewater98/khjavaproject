package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void Lotto() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�!!
		// ��, ����� ������������ ����
		// �ζ� ��ȣ�� �? 6��!!
		// �ζ� ��ȣ�� ������? 1 ~ 45
		Random rand = new Random();
		int[] nums = new int[6];
		int temp = 0;
		// ��ȣ�� �̴´�. X6
		for (int i = 0; i < nums.length; i++) {
			// ��ȣ�� �̴´�.
			// 1 ~ 45 - > 0 ~ 44 - > 1 ~ 45
			nums[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				// �񱳸� �Ѵ�. ���� ��������.
				// �񱳴� �̹̻��� �Ͱ� ù��°����~
			if(nums[i] == nums [j]) {
				// ������ i--
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
