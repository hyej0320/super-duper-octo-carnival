package quiz;  // package가 제일 윗줄

import java.util.Scanner;

public class B00_AgeCalculator {

		/*
		 	이름과 태어난 연도를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보세요
		 	
		 	ex) 이혜진 1995를 입력 => 이혜진(30세) 출력
		 		
		 		이혜진 1995
		 		이혜진(30세)
		 	
		 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름과 출생년도 입력: ");
		String name = sc.next();
		int born_year = sc.nextInt();
		int this_year = 2024;

		System.out.printf("%s(%d세)\n", name, this_year - born_year + 1 );
		
		
		
		
		
		
	}
	
}
