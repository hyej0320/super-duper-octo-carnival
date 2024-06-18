package quiz;

import java.util.Scanner;

public class E00_NumberOnly {

	/*
		사용자로부터 스캐너의 nextInt()로 숫자를 입력받되
		숫자가 아닌 것을 입력하더라도 프로그램이 강제 종료되지 않고
		다시 입력받을 수 있게 만들어보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요 > ");
			try {
				int num = sc.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("숫자를 입력받지 않았습니다");
				
			}
			
		}
		System.out.println("프로그램이 정상 종료되었습니다");
	}
}


