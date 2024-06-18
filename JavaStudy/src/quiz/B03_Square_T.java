package quiz;

import java.util.Scanner;

public class B03_Square_T {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("가로 입력: ");
		double width = sc.nextDouble();
		System.out.print("세로 입력: ");
		double height = sc.nextDouble();
		
		double area = Math.round(width * height * 100)/ 100.0 ;
		
		System.out.println(area);
		System.out.printf("\"%s\" 직사각형의 넓이는 %.2f\n", name, area);
	}
}
