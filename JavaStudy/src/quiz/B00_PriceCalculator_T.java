package quiz;

import java.util.Scanner;

public class B00_PriceCalculator_T {

	public static void main(String[] args) {
		
		// ※단축키: 블록 지정 후 alt 위 아래 방향키하면 한꺼번에 움직일 수 있음, 블록 지정 후 ctrl + / .
		int price1 = 2300;
		int price2 = 2800;
		int price3 = 3300;
		int price4 = 3500;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("1번 음료: %d원\n", price1);
		System.out.printf("2번 음료: %d원\n", price2);
		System.out.printf("3번 음료: %d원\n", price3);
		System.out.printf("4번 음료: %d원\n", price4);		
		System.out.print("> ");
		
		// System.out.println(sc.nextInt() * 2300 + sc.nextInt() * 2800 + sc.nextInt() * 3300 + sc.nextInt() * 3500) ;
		
		
		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();
		
		
		System.out.printf("첫번째 음료: %d개\n", qty1);
		System.out.printf("두번째 음료: %d개\n", qty2);
		System.out.printf("세번째 음료: %d개\n", qty3);
		System.out.printf("네번째 음료: %d개\n", qty4);
		
		System.out.println(qty1 * price1 + qty2 * price2 + qty3 * price3 + qty4 * price4 + "원");
		
		
	}
}
