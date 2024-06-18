package quiz;

import java.util.Scanner;

public class B08_Palindrome {

	/*
		사용자가 단어를 입력하면
		해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어보세요
		
		>> LEVEL 
		- 좌우대칭입니다
		
		>> Apple
		- 좌우대칭이 아닙니다
		
		>> BOB
		- 좌우대칭입니다
		
		>> ABBA
		- 좌우대칭입니다.
		
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어 입력: ");
		String text = sc.next();
		int len = text.length();
		
		for(int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			char ch1 = text.charAt(len - i - 1);
			if (ch == ch1) {
				System.out.print("좌우대칭입니다.");
			} else {
				System.out.print("좌우대칭이 아닙니다.");
			}
		}
			//0 = -1, 1 = -2, 2 = -3,
			//0번째 자리 숫자와 마지막자리 숫자의 문자가 같음을 표현하려면..
	}
}