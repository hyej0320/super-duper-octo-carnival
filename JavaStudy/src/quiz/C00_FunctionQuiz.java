package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz {

	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	2. 전달한 문자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 	
	 */
	
	public static boolean alphabet(char ch) {
		if (ch >= 'a' || ch <= 'z' || ch >= 'A' || ch <= 'Z') {
			return true;
		} 
		return false;
	}

	public static boolean three(int num) {
		if (num % 3 == 0) {
			return true;
		}
		return false;
	}
		
	public static String allEven(int num2) {
		if (num2 % 2 == 0) {
			return "짝수입니다" ;
		}
		return "홀수입니다";
	}
		
//	public static int[] aliNums(int num3) {
//		for (int i = 2; i <= num3; ++i) { // i는 2부터 모든 숫자
//			int countJ = 0;
//			for (int j = 1; j <= i; ++j) {
//				if (i % j == 0) { //i를 j로 나눠서 0으로 떨어지면 j는 약수
//					++countJ;
//					int[] arr = new int[countJ];
//
//				}
//			}
//		}
//		return Arrays.copyOf(arr, num3);
//		
//	}


	public static void main(String[] args) { 
		boolean ch = alphabet('a');
		System.out.println(ch);
		
		boolean num = three(301);
		System.out.println(num);
		
		String num2 = allEven(2);
		System.out.println(num2);
//		
//		int num3 = aliNums(10);
//		System.out.println(num3);
	}
}
