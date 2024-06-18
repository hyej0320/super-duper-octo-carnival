package quiz;

import java.util.Scanner;

public class B11_Count369_T {

	/*
	 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 	2. 그냥 숫자로 검사하는 방식
	 */
	public static void main(String[] args) {
		boolean DEBUG_MODE = false;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력해보세요 : ");
		int targetNum = sc.nextInt();
		
		int totalClapCount = 0;		
		for (int i = 1; i <= targetNum; ++i) {
			if (DEBUG_MODE) {
			System.out.print(i + ": ");
			}
			String numStr = "" + i;
			
			int len = numStr.length();
			for (int index = 0; index < len ; ++index) {
				char ch = numStr.charAt(index);
				if (ch == '3' || ch == '6' || ch == '9') {
					++totalClapCount;
					if (DEBUG_MODE) {
						System.out.print("짝");
					}
				}
			}		
			if (DEBUG_MODE) {
				System.out.println();
			}
		}
		System.out.printf("%d까지 369게임을 진행하면 박수를 총 %d번 쳐야합니다.", targetNum, totalClapCount);
		}
		
	}
