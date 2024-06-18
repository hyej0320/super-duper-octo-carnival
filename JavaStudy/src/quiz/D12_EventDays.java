package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_EventDays {
	
	/*
		실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요
		
		1+1 이벤트 : 매월 18일
		20% 할인 이벤트 : 홀수번째 주 금요일
		구매 시 아메리카노 무료 이벤트 : 매주 화요일
		
		※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 */
	
	public static void eventDays() {
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd(E)");

		int day = 0;
		while(day < 365) {
			calendar.add(Calendar.DATE, 1);
			
			String dateStr = dateFormat.format(calendar.getTime());
			
			int eightTeen = calendar.get(Calendar.DAY_OF_MONTH);
			int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			
			if (eightTeen == 18) {
				System.out.printf("%s: 1+1이벤트\n", dateStr);

			} 
			
			if (weekOfMonth % 2 == 1) {
				if (dayOfWeek == Calendar.FRIDAY) {
					System.out.printf("%s: 20%% 할인 이벤트\n", dateStr);
				}
			}
			
			if (dayOfWeek == Calendar.TUESDAY) {
				System.out.printf("%s: 구매 시 아메리카노 무료 이벤트\n", dateStr);
				
			}
			
			System.out.printf("%s\n", dateStr);
			++day; 

		}
	}

	public static void main(String[] args) {
		eventDays();
	}
}
