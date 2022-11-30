package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int k = 1;
		int[][] array = new int[5][5];
		
		for(int i = 0; i < array.length; i++){
			for(int j = array[i].length - 1; j >= 0; j--){
				array[i][j] = k;
				k++;
			}
		}
		for(int i =  0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	

	public void exercise2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 17 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int k = 1;
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				array[j][i] = k;
				k++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array.length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
		}
	}
	
	public void exercise3() {
	//  1   6   11   16   21
	//  2   7   12   17   22
	//  3   8   13   18   23
	//  4   9   14   19   24
	//  5  10   15   20   25
         int k = 1;
         int[][] array = new int[5][5];
         for(int i = 0; i < array.length; i++) {
        	 for(int j = 0; j < array.length; j++) {
        		 array[j][i] = k;
        		 k++;
        	 }
         }
         for(int i =  0; i < array.length; i++) {
 			for(int j = 0; j < array[i].length; j++) {
 					System.out.printf("%2d ", array[i][j]);
 			}
 			System.out.println();
 		}
	}
   
	public void exercise4() {
	//  1    2    3    4    5
    // 10    9    8    7    6
	// 11   12   13   14   15
	// 20   19   18   17   16
	// 21   22   23   24   25
		int k = 1;
		int[][] array = new int[5][5];
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < array.length; j++) {
						array[i][j] = k;
						k++;
				}
			}
			else {
				for(int j = array[i].length -1; j >= 0; j--) {
					{
						array[i][j] = k;
						k++;
			       }         
			   }
		   }
		}
		for(int i =  0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}

	}
   
    public void exercise5() {
	// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
    // 4년간 전체 평점 평균을 출력하라.
    	double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
    	double sum = 0.0;
      	for(int i = 0; i < score.length; i++){
   		    for(int j = 0; j < score[i].length; j++){
   			   sum += score[i][j];
   			
    	    }
    	}
      	System.out.println(sum / (score.length * score[1].length) );
    }
   
    public void exercise6() {

    }
}
