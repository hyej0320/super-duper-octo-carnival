package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz2 {

	/*
		# 알맞은 조건식을 만들어보세요
		
		1. char형 변수 a가 'q'또는 'Q'일 때 true
		2. char형 변수 b가 공백이나 탭이 아닐 때 true
		3. char형 변수 c가 '0' ~ '9'일 때 true
		4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
		6. 사용자가 입력한 문자열이 quit일 때 true
	 */
	
	public static void main(String[] args) {
		
		char a = 'n';
		System.out.println(a == 'q' || a == 'Q');
		
		char b = ' ';
		System.out.println(b != ' ' || b != '\t');
		
		char c = 'n';
		System.out.println(c >= '0' && c <= '9');
		
		char d = 'D';
		System.out.println(d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z');
				
		char e = '가';
		System.out.println(e >= 0xAC00 && e <= 0xD7A3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String text = sc.next();
		System.out.println(text.equalsIgnoreCase("quit"));
		
	}
}
