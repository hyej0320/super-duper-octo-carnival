package quiz;

import java.util.Scanner;

public class B00_WonToDollar {

	
	/* 	
	 	한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
	 	(현재 환율 검색)
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한국(원): ");
		
		int won = sc.nextInt();
		double dollar = 1374.29;
		
		System.out.printf("%s%.2f", "미국(달러): ", won / dollar);
				
	}
	 
}
