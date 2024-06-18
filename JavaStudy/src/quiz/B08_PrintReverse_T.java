package quiz;

import java.util.Scanner;

public class B08_PrintReverse_T {

	public static void main(String[] args) {
		
		System.out.print("문장을 입력하세요: ");
		String text = new Scanner(System.in).nextLine();
		
		for (int i = 0; i < text.length(); ++i) {
			System.out.print(i);
		}
		System.out.println();
		
		for (int i = 0; i < text.length(); ++i) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		// 마지막 인덱스부터 0까지 반복하며 한 글자씩 출력하기
		for (int i = text.length() - 1; i >= 0; --i) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		// 마지막 인덱스에서 1씩 더 빼면서 한 글자씩 출력하기
		int len = text.length();
		for (int i = 0; i < len; ++i) {
			System.out.print(text.charAt(len - 1 - i));
			
		}
		System.out.println();
	}
}
