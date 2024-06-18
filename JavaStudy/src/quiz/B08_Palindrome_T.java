package quiz;

import java.util.Scanner;

public class B08_Palindrome_T {

	public static void main(String[] args) {
		
		/*
		 0 == len - 1
		 1 == len - 1 - 1
		 */
		
		System.out.print("단어 입력: ");
		String word = new Scanner(System.in).next();
		int len = word.length();
		int half = len / 2;
		
		// 좌우대칭 여부를 저장해 놓을 변수
		boolean isPalindrome = true;
		
		for (int i = 0; i < half; ++i) {
			//System.out.printf("%c vs %c\n",  word.charAt(i), word.charAt(len - 1 - i));
			
			// i        ch1        ch2
			// ---------------------------------
			// 0        0번째     len - 1
			// 1		1번째     len - 1 - 1
			// 2 		2번째     len - 1 - 2
			// 3 		3번째     len - 1 - 3
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				isPalindrome = false;
			} 
		}
		if (isPalindrome) {
			System.out.println("좌우대칭입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다");
		}
	}
	
	
}
