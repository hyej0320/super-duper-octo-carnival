package quiz;

import java.util.Scanner;

public class B09_Numeric {

	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별해주는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		String text = sc.next();
		int len = text.length();
		
		boolean number = true;
		
		for(int i = 0; i < len ; ++i) {
			char ch = text.charAt(i); 
						
			if(ch < '0' || ch > '9') {
				continue;
				
			}
			
			if(number) {
				System.out.print(ch);
			} else {
				System.out.print("숫자 및 문자가 포함되어 있습니다.");
			}

		}
		
	}
}
