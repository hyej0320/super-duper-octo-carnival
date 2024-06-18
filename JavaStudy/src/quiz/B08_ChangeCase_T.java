package quiz;

import java.util.Scanner;

public class B08_ChangeCase_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력: ");
		String text = sc.nextLine();
		int len = text.length();
		int diff = Math.abs('A' - 'a');
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				System.out.print((char)(ch - diff));
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.print((char)(ch + diff));
			} else {
				System.out.print(ch);
			}
			
		}
	}
}
