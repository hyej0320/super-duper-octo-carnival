package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E00_NumberOnly_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("> ");
				int num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요!!");
				String trash = sc.nextLine();
				System.out.println("통로에 남아있던 잘못된 문자: " + trash);
			}
		}
		System.out.println("프로그램이 정상 종료되었습니다");
	}
}
