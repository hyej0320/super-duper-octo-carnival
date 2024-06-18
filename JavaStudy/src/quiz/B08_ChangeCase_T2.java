package quiz;

import java.util.Scanner;

public class B08_ChangeCase_T2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력: ");
		String text = sc.nextLine();
		int len = text.length();

		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				System.out.print(ch - 'a' - 'A');
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.print(ch - 'A' - 'a');
			} else {
				System.out.print(ch);
			}

		}
	}
}
