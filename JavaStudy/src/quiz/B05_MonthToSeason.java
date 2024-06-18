package quiz;

import java.util.Scanner;
public class B05_MonthToSeason {

	/*
	 	사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 	- switch-case문, if문으로 한 번씩 만들기 (+ 문자열 포함)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월인지 숫자 입력: ");
		int month = sc.nextInt();
		String mon = sc.next();
		
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.print("겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.print("여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.print("가을입니다.");
				break;
			default:
				System.out.print("잘못된 숫자 입력\n");
				break;
		}
						
		
		
		String season;
		boolean wrong = false;
		
		if (month < 1 || month > 12) {
			System.out.println("숫자를 잘못 입력하였습니다!");
			wrong = true;
			season = "babo"; // 변수 초기화 필요
		} else if (month >=3 || month <=5 ) {
			season = "봄";
		
		} else if (month >=6 || month <=8 ) {
			season = "여름";
			
		} else if (month >=9 || month <=11) {
			season = "가을";
			
		} else {
			season = "겨울";
		}
		
		if (wrong) {
			System.out.println("잘못된 숫자 입력입니다.");
		} else {
			System.out.printf("%d월은 %s입니다.\n", month, season);
		}

		
	}
}
