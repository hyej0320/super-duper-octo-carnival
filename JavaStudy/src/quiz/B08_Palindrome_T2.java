package quiz;

import java.util.Scanner;

public class B08_Palindrome_T2 {

	public static void main(String[] args) {
		
		// 원래 단어와 거꾸로 뒤집은 단어가 같으면 좌우대칭
		
		System.out.print("단어 입력: ");
		String word = new Scanner(System.in).next();
		
		int len = word.length();
		
		String reversed = "";
		for (int i = 0; i < len; ++i) {
			//System.out.printf("%c", word.charAt(len - 1 - i));
			reversed += word.charAt(len - 1 - i);
		}
		
		System.out.println("좌우대칭입니까? " + reversed.equals(word));
	}
}
