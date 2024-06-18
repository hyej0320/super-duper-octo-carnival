package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

	/* 
	 	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	 	평균 점수와 등급을 출력해주는 프로그램을 만들어보세요
	 	(각 과목의 유효 점수는 0 ~ 100점이고,
	 	 유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 F로 나와야한다)
	 
	 	1. 평균점수 90점 이상 A	
	       평균점수 80점 이상 B
	       평균점수 70점 이상 C
	       평균점수 60점 이상 D
	       그 외 F
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int subQty = 3;
		
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int average = (kor + eng + math) / subQty ;
		char grade;
		
		if (kor < 0 || kor > 100 && eng < 0 || eng > 100 || math < 0 || math > 100) {
			System.out.println("<경고> 잘못된 값을 입력");
			average = 0; 
			grade = 'F';
		} else if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		if (average != 0) {
			System.out.printf("평균 점수: %d점, %s등급", average, grade);	
		} else {
			System.out.printf("평균 점수: %d점, %s등급", average, grade);
		
		}
	}
}
	