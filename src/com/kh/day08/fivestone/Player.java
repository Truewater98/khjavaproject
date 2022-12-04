package com.kh.day08.fivestone;

public class Player {
    private int win = 0;
    private int lose = 0; 
    private char mal = '\u0000';
    
    public Player() {
    	win = 0;
    	lose = 0;
    }
  
    public Player(char a) {
    	mal = a;
    }
    
    public void SetMal(char a) {
    	mal = a;  
    }
    
    public void upWin() {
    	win++;
    }
    
    public void uplose() {
    	lose++;
    }
    public char GetMal() {
    	return mal;
    }
    
    public void ShowLate() {
    	System.out.println("승 : " + win + " 패 : " + lose);    	
    }
    
    
}
