package quiz;

import java.util.Scanner;

public class B00_PriceCalculator {

	/*
	 	음료 개수를 입력하면 총 가격을 출력해보세요
	 	(음료수는 개당 2300원입니다)
	 	
	 */
	
	public static void main(String[] args) {
		
		// System.out.println("음료 개수: ");
		
		// Scanner sc = new Scanner(System.in);
		
		// int drink = sc.nextInt();
		// int price = drink * 2300;
		
		// System.out.printf("%s%d원입니다.", "총 가격은 " , price);
		
	
		
	/*
		4가지 음료 개수를 입력하면 총 가격을 출력해보세요
	 	(각 음료수의 가격은 2300, 2800, 3300, 3500원입니다.)
		ex) 0 5 0 1 = 15000원
		
	*/
	
		Scanner sc = new Scanner(System.in);
		
		int price1 = 2300; 
		int	price2 = 2800;
		int price3 = 3300; 
		int price4 = 3500;

		System.out.printf("1번 음료: %d원\n", price1);
		System.out.printf("2번 음료: %d원\n", price2);
		System.out.printf("3번 음료: %d원\n", price3);
		System.out.printf("4번 음료: %d원\n", price4);
		
		System.out.println("음료 갯수 입력: ");
		
		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();
		
		System.out.printf("1번 음료: %d개\n", qty1);
		System.out.printf("2번 음료: %d개\n", qty2);
		System.out.printf("3번 음료: %d개\n", qty3);
		System.out.printf("4번 음료: %d개\n", qty4);
	
		int total = price1 * qty1 + price2 * qty2 + price3 * qty3 + price4 * qty4;
		
		System.out.printf("총 음료의 가격은 %d원입니다", total);
		
		
		

	}

}
