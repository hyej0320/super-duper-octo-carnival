package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz_T {

	// 1.
	public static boolean isAlphabet(char ch) {
		return
		(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
			
	}
	
	// 2.
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	} 
	
	// 3. 
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 4.
	public static int[] getYaksuList(int num) {
		int[] yaksuArr = new int[num];
		
		// num : 전달받은 숫자
		// div : 전달받은 숫자를 나눠볼 숫자
		int index = 0;
		for (int div = 1; div <= num ; ++div) {
			if (num % div == 0) {
				// ++이 뒤에 들어갔으므로 대입을 하고 난 후 index가 증가한다
				yaksuArr[index++] = div;
			}
		}
		
		return Arrays.copyOf(yaksuArr, index);
	}
	
	// 5.
	public static boolean isPrime(int num) {
		return getYaksuList(num).length == 2;
	}
	
	// 6.
	public static void printMessage(String message, int times) {
		for(int i = 0; i < times; ++i) {
			System.out.println(message);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('나'));
		System.out.println(isAlphabet('H'));
		System.out.println("--------");

		System.out.println(isMul3(5));
		System.out.println("--------");
		
		System.out.println(checkEvenOdd(11));
		System.out.println("--------");
		
		System.out.println(Arrays.toString(getYaksuList(10)));
		System.out.println("--------");
		
		System.out.println(isPrime(11));
		System.out.println("--------");
		
		printMessage(" /)/)\n(  ..)", 5);
	}
}
