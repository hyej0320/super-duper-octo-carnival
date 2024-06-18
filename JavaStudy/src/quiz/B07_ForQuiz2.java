package quiz;

public class B07_ForQuiz2 {

	/*
	 	# for문을 사용해 숫자를 다음과 같이 출력해보세요
	 	
	 	1. 0 3 6 9 12 ... 93 96 99
	 	2. -35 -28 -21 ... 0 7 14 ... 35
	 	3. 100 200 300 ... 800 900 1000
	 	4. 100 99  97 ... 5 4 3 2 1 0
	 	5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
	 	6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	 	7. 7 77 777 7777 77777 .... 7777777777
	 */
	public static void main(String[] args) {
		
		// 1.
		for(int i = 0; i < 100 ; i += 3) {
				System.out.printf("%d ", i);
			}
		
		System.out.println();
		
		// 2.
		for(int i = -35; i <= 35 ; ++i) {
			if(i % 7 == 0) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		// 3. 
		for (int i = 100; i <= 1000; ++i) {
			if (i % 100 == 0) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		// 4. 
		for (int i = 100; i >= 0; --i) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();

		//5.
		for (int i = 0, cnt = 0; i < 3 ; ++i) {			
			++cnt;
			for (cnt = 0; cnt < 10; ++cnt) {
				System.out.printf("%d ", cnt);
			
			}
		}
		
		System.out.println();
		
		// 6.
		for (int i = 3, cnt = 0; i > 0 ; --i) {
			++cnt;
			for (cnt = 10; cnt > 0; --cnt) {
				System.out.printf("%d ", cnt);
			}
		
		}
		System.out.println();
		
		// 7.
		for (long i = 7, cnt = 0 ; i <= 7777777777L ;  i *= 10 , i += 7) {
			System.out.printf("%d ", i);
			
			// 77 = 7 * 10 + 7
			// 777 = 7 * 10 ^ 2 + 7 * 10 + 7
			// 7777 = 7 * 10 ^ 3 + 7 * 10 ^ 2 + 7 * 10 + 7
			
			
		}
		
	}	
}
