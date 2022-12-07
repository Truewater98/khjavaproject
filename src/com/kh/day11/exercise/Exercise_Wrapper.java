package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void parserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		System.out.println(Integer.parseInt(strNum2) - Integer.parseInt(strNum));
	}
	
	public static void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData2);
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		char[] ch = new char[strData3.length()];
		for(int i = 0; i < strData.length(); i++) {
			ch[i] = strData3.charAt(i);
		}
		char[] ch1 = strData3.toCharArray();
		for(char i : ch1) {
			System.out.print(i);
		}
 
	}
	
}

