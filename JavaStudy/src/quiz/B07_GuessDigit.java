package quiz;

import java.util.Scanner;

public class B07_GuessDigit {

	/*
		(1) 사용자가 어떤 숫자를 int타입 값을 입력하면 해당숫자가 몇 자리 숫자인지
			알려주는 프로그램을 만들어보세요
		
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력:");
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= num; i *= 10) {
			++cnt;			
		}
		System.out.println(cnt);
	}
}
