package quiz;

import java.util.Scanner;

public class B08_CountE {

	/*
		사용자가 문장을 입력하면 해당 문장에 포함된 
		알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
		(대/소문자 모두 개수에 포함)
		
	 */
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요: ");
		String str = sc.nextLine();
		
		int cnt = 0;
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == 'e' || str.charAt(i) == 'E') {
			++cnt;
			} 
		} 
		System.out.printf("알파벳 E(e)의 개수: %d" , cnt);
	}
}