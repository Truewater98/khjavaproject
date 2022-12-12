package com.kh.day14.listcollection;

import java.util.Arrays;

public class Intlist {
	private int[] nums;

	private int size;
	public Intlist() {
		nums = new int[3];
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		
		// 용량이 꽉 찰 경우
		// 용량을 2배로 해줌
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2;
			// 새롭게 배열을 만들어줌
			nums = Arrays.copyOf(nums, new_capacity);
		}
	}
	public void add (int input) {
		// int input = 1
//		nums = Arrays.copyOf(nums, nums.length+1);
		if(size == nums.length) {
			resize();
		}
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
