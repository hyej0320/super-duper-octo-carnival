package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class D13_EventDays_T {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate afterOneYear = now.plusDays(365);

		
		// now가 365일이 되기 전까지 while 반복을 한다
		LocalDate check = now;
		
		// DateTimeFormatter를 사용해 java.time 패키지의 인스턴스로 문자열 만들기
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)", Locale.KOREAN);
		
		// now.isBefore()는 무한루프를 돌기 때문에 check활용
		while(check.isBefore(afterOneYear)) {
			System.out.print(check.format(f) + ": ");
			boolean eventExist = false;
			
			if(check.getDayOfMonth() == 18) {
				System.out.print("1+1 이벤트");
				eventExist = true;
			}
			// 한 주에 대한 정의를 수정한 인스턴스를 생성할 수 있다
			// : 한 주를 시작하는 첫 요일(기본값 월요일), 첫 주가 되기 위한 최소 날짜(기본값 1)
			WeekFields weekField = WeekFields.of(DayOfWeek.TUESDAY, 3);
			// WeekFields
			// Week와 관련된 여러 시간 단위(TemporalField)들을 제공해주는 클래스
			int weekOfMonth = check.get(WeekFields.of(Locale.KOREAN).weekOfMonth());

			if (weekOfMonth % 2 == 1 
					&& check.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
				if (eventExist) {
					System.out.print(", 20% 할인 이벤트");
				} else {
					System.out.print("20% 할인 이벤트");
					eventExist = true;
				}
			}
			
			if (check.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
				if (eventExist) {
					System.out.print(", 구매 시 아메리카노 무료 이벤트");
				} else {
					System.out.print("구매 시 아메리카노 무료 이벤트");
					eventExist = true;
				}
			}
						
			System.out.println();
			check = check.plusDays(1);
			
		}
	}
}
