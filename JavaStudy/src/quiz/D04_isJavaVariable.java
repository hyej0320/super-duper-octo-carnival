package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {

	/*
		사용자로부터 문자열을 입력받으면
		해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		String text = sc.nextLine();
		
		char ch;
		int i = 0; 
		while(i < text.length()) {
			ch = text.charAt(i);
			if (!Character.isJavaIdentifierStart(ch)) {
				System.out.println("자바 변수 사용 불가");
				break;
			} 
			++i;
		}

	}
}
