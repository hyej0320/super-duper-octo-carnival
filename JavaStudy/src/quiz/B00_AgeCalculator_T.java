package quiz;

import java.util.Scanner;

public class B00_AgeCalculator_T {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름과 태어난 년도를 입력 >> ");
		
		String name = sc.next();
		int bornYear = sc.nextInt();
		int thisYear = 2024;
		
		int age = thisYear - bornYear + 1;
		
		System.out.printf("%s(%d세)\n", name, age);
	}
	
}
