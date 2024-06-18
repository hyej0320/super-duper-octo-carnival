package quiz;

import java.util.Scanner;

public class B05_MonthToSeason_T {

	public static void main(String[] args) {
		
		System.out.print("월을 입력(숫자): ");
		int month = new Scanner(System.in).nextInt(); 
		// Scanner sc = new Scanner(System.in);
		// int month = sc.nextInt();
		
		String seasonName;
			switch (month) {
			default:
				seasonName = "없는 달";
				break;
			case 12: case 1: case 2:
				seasonName = "겨울";		
				break;
			case 3: case 4: case 5:
				seasonName = "봄";
				break;
			case 6: case 7: case 8:
				seasonName = "여름";
				break;
			case 9: case 10: case 11:
				seasonName = "가을";
				break;
		}
		System.out.printf("%d월은 %s입니다.\n", month, seasonName);
	
		if (month >= 3 && month <= 5) {
			seasonName = "봄";
		} else if (month >= 6 && month <= 8) {
			seasonName = "여름";
		} else if (month >= 9 && month <= 11) {
			seasonName = "가을";
		} else if (month == 12 || month == 1 || month == 2) {
			seasonName = "겨울";
		} else {
			seasonName = "없는 달";
		}
		System.out.printf("%d월은 %s입니다.\n", month, seasonName);
		
		System.out.print("월을 입력(영어): ");
		String monthName = new Scanner(System.in).next();
		
		// "문자열".toLowerCase() : 어떤 문자열을 모두 소문자로 바꿔준다
		// monthName = monthName.toLowerCase();
		
		// 비교 시 소문자 또는 대문자로 통일한 후에 비교하면
		// 대소문자 상관 없이 비교가 가능하다
		switch (monthName.toLowerCase()) {
			case "sep": case "oct": case "nov":
				seasonName = "Autumn";
				break;
			case "dec": case "jan": case "feb":
				seasonName = "Winter";
				break;
			case "mar": case "apr": case "may":
				seasonName = "Spring";
				break;
			case "jun": case "jul": case "aug":
				seasonName = "Summer";
				break;
			default:
				seasonName = "Invalid Month";
				break;
		}
		System.out.printf("'%s' is '%s' in Korea.\n", 
				monthName.toUpperCase(), seasonName);
		
		// 문자열(뿐만 아니라 대문자로 시작하는 모든 타입들 비교 시에는 equals()
		if (monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb") ||
				monthName.equalsIgnoreCase("Dec")) {
			seasonName = "Autumn";
		} else if (monthName.equalsIgnoreCase("Mar") || monthName.equalsIgnoreCase("Apr") ||
				monthName.equalsIgnoreCase("May")) {
			seasonName = "Spring";
		} else if (monthName.equalsIgnoreCase("Jun") || monthName.equalsIgnoreCase("Jul") ||
				monthName.equalsIgnoreCase("Aug")) {
			seasonName = "Summer";
		} else if (monthName.equalsIgnoreCase("Sep") || monthName.equalsIgnoreCase("Oct") ||
				monthName.equalsIgnoreCase("Nov")) {
			seasonName = "Winter";
		} else{
			seasonName = "Invalid Month";
		}
			System.out.printf("'%s'is '%s' in Korea.\n", monthName.toUpperCase(), seasonName.toUpperCase());
			
	
		
	}
}
