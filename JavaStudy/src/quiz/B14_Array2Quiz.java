package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1}
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		
		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
		
		// 3. 각 행(row)의 합을 구해서 출력하기
		
		// 4. 각 열(col)의 합을 구해서 출력하기

		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);	
			}
			System.out.print(Arrays.toString(myArr[i]) + "\n");
		}

		System.out.println();
		
		int total = 0;
		int avg = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
					total += myArr[i][j];
					++avg;
			}
		}
		System.out.println("총합: " + total);
		System.out.println("평균: " + total / avg);
		
		System.out.println();
		
		
		int rowTotal = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
					rowTotal += myArr[i].length;
			}
		}
		System.out.println(myArr[0][0] + myArr[0][1] + myArr[0][2] + myArr[0][3] + myArr[0][4]);
		System.out.println(myArr[1][0] + myArr[1][1] + myArr[1][2] + myArr[1][3] + myArr[1][4]);
		System.out.println("총합: " + rowTotal);
		System.out.println(Arrays.toString(myArr[0]));
		System.out.println(Arrays.toString(myArr[1]));
	}
}
