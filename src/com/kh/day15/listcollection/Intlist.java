package com.kh.day15.listcollection;

import java.util.Arrays;

public class Intlist {
	private int[] nums;

	private int size;
	public Intlist() {
		nums = new int[3];
		size = 0;
	}
	
	public void add (int input) {
		// int input = 1
//		nums = Arrays.copyOf(nums, nums.length+1);
		nums[size] = input;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
