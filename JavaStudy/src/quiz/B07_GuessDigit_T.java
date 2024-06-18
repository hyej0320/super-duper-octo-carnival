package quiz;

import java.util.Scanner;

public class B07_GuessDigit_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 보세요 > ");
		int num = sc.nextInt();

	
		int cnt;
		for (cnt = 0; num > 0; num /= 10) {
			++cnt;
		}System.out.println(cnt + "자리 숫자입니다.");
		
		
		// 원시적인 생각을 잘 밀어붙인 결과
//		int cnt = 1;
//		for (int compare = 10; compare <= 1000000000 && compare <= num ; 
//				compare *= 10) {
//			++cnt;
//		}	System.out.println(cnt + "자리");
		
	}
}