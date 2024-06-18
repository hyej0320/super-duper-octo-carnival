package quiz;

import java.util.Scanner;
public class B04_AppleQuiz_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bucketSize = 10;
		
		System.out.println("바구니의 크기: " + bucketSize);
		System.out.print("사과의 개수: ");
		int appleQty = sc.nextInt();
		int bucketQty = appleQty / bucketSize ;
		
		
		// ※ 조건을 짤 때 안되는 값부터 먼저 걸러내면 편해진다
		if (appleQty < 0) {
			System.out.println("[경고] 사과 개수가 이상합니다.");
			bucketQty = -1; // 바구니 개수를 -1로 설정해 오류임을 표시
		} else if (appleQty % bucketSize > 0 ) { 		// 사과가 바구니의 크기로 딱 나누어 떨어질 때와 아닐 때를 대비해야 한다
			bucketQty = appleQty / 10 + 1;
		} else { 
			bucketQty = appleQty / 10;
		}
		
		if (bucketQty != -1) {
		System.out.printf("사과 %d개를 담기 위해 필요한 바구니의 개수는 " + 
					"%d개 입니다.\n", appleQty, bucketQty);
		} else {
			System.out.println("시스템 오류입니다.");
		}
		
	}
}
