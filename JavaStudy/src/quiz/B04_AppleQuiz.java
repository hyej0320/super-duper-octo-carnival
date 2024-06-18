package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {

	/*
		사과를 10개씩 담을 수 있는 바구니가 있을 때
		사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
		바구니의 개수를 알려주는 프로그램을 만들어보세요.
		
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사과의 개수를 입력: ");
		int apple = sc.nextInt();
		int basketSize = 10;
		int basketQty = apple / basketSize;
		if (apple < 0) {
			System.out.println("[오류]사과 개수가 이상합니다!");
			basketQty = -1;
		} else if (apple % basketSize > 0) {
			basketQty = apple / basketSize + 1;
		} else {
			basketQty = apple / basketSize;
		}
		
		System.out.printf("필요한 바구니의 개수: %d개", basketQty);
		
	}

}