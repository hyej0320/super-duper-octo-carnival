package quiz;

import java.util.Scanner;

public class B13_Lotto2 {
	/*
		1등 또는 2등에 당첨될 때까지 랜덤 로또 번호를 계속 생성하여
		몇 번만에 당첨되었는지 출력해보세요 
		
		- 구매자의 번호는 6개
		- 보너스 번호를 제외하고 모두 맞추면 1등
		- 보너스 번호를 포함하여 모두 맞추면 2등
	 */
		
	public static void main(String[] args) {

		int currIndex = 0;
		
		int[] winNums = new int[7];
		
		while (currIndex != 7) {
			int num = (int)(Math.random() * 45 + 1);
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}
		}
		for (int i = 0; i < winNums.length; ++i) {
			System.out.print(winNums[i] + " ");
			
		}
		System.out.println();
		
		int selectIndex = 0;
		
		int[] selectNums = new int [6];
		while (selectIndex != 6) {
			int num = (int)(Math.random() * 45 + 1);
			boolean repeated = false;
			for (int i = 0; i < selectIndex; ++i) {
				if (selectNums[i] == num) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				selectNums[selectIndex] = num;
				++selectIndex;
			}
		}
		for (int i = 0; i < selectNums.length; ++i) {
			System.out.print(selectNums[i] + " ");
		}
		System.out.println();

		
		int count = 0;
		for (int i = 0; i < winNums.length; ++i) {
			for (int j = 0; j < selectNums.length; ++j) {
				if (selectNums[j] == winNums[i]) {
					++count;
				}
				if (count == 6 && selectNums[j] != winNums[6]) {
					System.out.print("1등 당첨!");
				} else if (count == 5 && selectNums[j] == winNums[6]) {
					System.out.print("2등 당첨!");
				}
			}
		}
//		switch(count) {
//		case 6: 
//			System.out.print("1등 당첨!");
//			break;
//		case 5:
//			System.out.print("2등 당첨!");
//			break;	
//		case 1:
//			System.out.print("5등 당첨!");
//			break;	
//		
//		}
		
	}
	
}
