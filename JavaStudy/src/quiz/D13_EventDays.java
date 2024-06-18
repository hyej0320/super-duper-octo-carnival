package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class D13_EventDays {
	
	/*
		java.time 패키지의 클래스들만 활용하여
		실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요
		
		1+1 이벤트 : 매월 18일
		20% 할인 이벤트 : 홀수번째 주 금요일
		구매 시 아메리카노 무료 이벤트 : 매주 화요일
		
		※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 */
	public static void eventDays() {
		LocalDate now_d = LocalDate.now();
		System.out.println(LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY)));
		System.out.println(LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.FRIDAY)));
		System.out.println(LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(5, DayOfWeek.FRIDAY)));
		
		for(int i = 0 ; i < 365 ; ++i) {
			LocalDate date = now_d.plusDays(i);
			System.out.printf("[%s]의 이벤트: \n" , date);
			
			
			
			if (date.getDayOfMonth() == 18) {
				System.out.println ("1+1 이벤트 ");
			}
			
			if (date.getDayOfWeek() == DayOfWeek.FRIDAY){ 

					System.out.println("20% 할인 이벤트 ");
			}
			
			if (date.getDayOfWeek() == DayOfWeek.TUESDAY) {
				System.out.println("구매 시 아메리카노 무료 이벤트");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		eventDays();
	}
}
