package quiz;

import java.util.Scanner;

public class B11_Count369 {

	/*
	 	사용자가 숫자를 입력하면 해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇 번 쳐야하는 지 출력해보세요

	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int len = num.length();
		
		for (int i = 1, cnt = 0;i < len ; ++i) {

			System.out.print(num);
			char ch = num.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9') {
				++cnt;
				System.out.println(cnt);
			} 
		}
		System.out.print("박수는 " );
		
		
		// 1의 자리에 3의 배수, 10의 자리에 3의 배수, 100의 자리에 3의 배수

	}
}
