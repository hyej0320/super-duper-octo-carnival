package quiz;

import java.util.Scanner;

public class B00_WonToDollar_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KRW > ");
		int krw = sc.nextInt();
		
		// 1달러 당 1374.29원
		
		double exchangeRate = 1374.29; 
		double usd = krw / exchangeRate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다.\n", krw, usd);
		
	}
}
