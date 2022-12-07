package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		// È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã ÀÇ ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦ /±âÁØÀ¸·Î Àß¶ó¼­ È«·Ã¸¸ Ãâ·ÂÇÏ½Ã¿À
		String str = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		StringTokenizer st = new StringTokenizer(str,"/");
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("È«·Ã"))
			System.out.println("È«·Ã");
		}
		
		
	}
}
