package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz2 {

	/*
		1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
		2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
		3. 문자열을 전달하면 해당 문자열의 좌우 대칭 여부를 반환하는 함수
		4. 함수를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 */
	public static char[] resultRandom(String text) {
	
		char[] arr = new char[text.length()];
		for (int i = 0; i < arr.length ; ++i) {
			arr[i] = text.charAt(i);
		}
		
		for (int i = 0; i < 1000 ; ++i) {
			int randomIndex = (int)(Math.random() * (arr.length - 1) + 1);
			
			char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		return arr;
	}
	
	public static String printReverse(String text) {
		int len = text.length();
		for (int i = len - 1 ; i >= 0; --i) {
			System.out.print(text.charAt(i));
		}
		return "";
	}
	
	
	public static boolean isPalindrome(String text) {
		int len = text.length();
		int half = len / 2;
		for (int i = 0; i < half; ++i) {
			char ch1 = text.charAt(i);
			char ch2 = text.charAt(len - 1 - i);
			if (ch1 != ch2) {
				return false;
			}
		}
		return true;
	}
	
//	public static int[] noRepeated(int num) {
//		
//	}
	
	
	public static void main(String[] args) {
		System.out.println(resultRandom("I didn't have a breakfast, did i?"));
		
		String reversed = printReverse("안녕하세요");
		System.out.println("\n실제 반환받은 reversed: " + reversed);
		
		System.out.println(isPalindrome("looool"));
	}
}
