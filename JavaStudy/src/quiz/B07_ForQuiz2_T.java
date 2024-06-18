package quiz;

public class B07_ForQuiz2_T {

	public static void main(String[] args) {

		
	// 1.
		// for문 내부에서 선언한 변수는 for문의 {}가 끝나면 사라진다
		for (int i = 0; i <= 99; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	// 2.
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	// 3.
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();

	// 4.
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	// 5.
		for (int i = 0; i < 30; ++i) {
			System.out.print(i % 10 + " ");
		}
		System.out.println();
		
	// 6.
		for (int i = 0; i < 30; ++i) {
			System.out.print((10 - i % 10) + " "); // 거꾸로 세고 싶을 때는 - 를 활용
		}
		System.out.println();
		
	// 7. 
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		} 
		System.out.println();
		
		String numStr = "";
		for (int i = 0; i < 10; ++i) {
			numStr += "7";
			System.out.print(numStr + " ");
		}
		System.out.println();
	}
}
