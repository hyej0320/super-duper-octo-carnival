package myobj;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class KoreanHolidays {

	final private static HashMap<Integer, List<Calendar>> HOLIDAYS = 
			new HashMap<>();
	
	static {
		List<Calendar> holidays2024 = new ArrayList<>();
		
		Calendar 신정= Calendar.getInstance();
		Calendar 구정1 = Calendar.getInstance();
		Calendar 구정2 = Calendar.getInstance();
		Calendar 삼일절 = Calendar.getInstance();
		Calendar 총선 = Calendar.getInstance();
		Calendar 어린이날 = Calendar.getInstance();
		Calendar 석가탄신일 = Calendar.getInstance();
		Calendar 현충일 = Calendar.getInstance();
		Calendar 광복절 = Calendar.getInstance();
		Calendar 추석1 = Calendar.getInstance();
		Calendar 추석2 = Calendar.getInstance();
		Calendar 추석3 = Calendar.getInstance();
		Calendar 개천절 = Calendar.getInstance();
		Calendar 한글날 = Calendar.getInstance();
		Calendar 크리스마스 = Calendar.getInstance();
		
		신정.set(2024, 0, 1);
		구정1.set(2024, 1, 9);
		구정2.set(2024, 1, 12);
		삼일절.set(2024, 2, 1);
		총선.set(2024, 3, 10);
		어린이날.set(2024, 4, 6);
		석가탄신일.set(2024, 4, 15);
		현충일.set(2024, 5, 6);
		광복절.set(2024, 7, 15);
		추석1.set(2024, 8, 16);
		추석2.set(2024, 8, 17);
		추석3.set(2024, 8, 18);
		개천절.set(2024, 9, 3);
		한글날.set(2024, 9, 9);
		크리스마스.set(2024, 11, 25);
		
		holidays2024.add(신정);
		holidays2024.add(구정1);
		holidays2024.add(구정2);
		holidays2024.add(삼일절);
		holidays2024.add(총선);
		holidays2024.add(어린이날);
		holidays2024.add(석가탄신일);
		holidays2024.add(현충일);
		holidays2024.add(광복절);
		holidays2024.add(추석1);
		holidays2024.add(추석2);
		holidays2024.add(추석3);
		holidays2024.add(개천절);
		holidays2024.add(한글날);
		holidays2024.add(크리스마스);
		
		HOLIDAYS.put(2024, holidays2024);
		HOLIDAYS.put(2025, new ArrayList<>());
	}
	
	public static boolean isHoliday(Calendar day) {
		
		int year = day.get(Calendar.YEAR);
		int mon1 = day.get(Calendar.MONTH);
		int date1 = day.get(Calendar.DATE);
		
		List<Calendar> holidayList= HOLIDAYS.get(year);
			
		for(Calendar holiday : holidayList) {
			int mon2 = holiday.get(Calendar.MONTH);
			int date2 = holiday.get(Calendar.DATE);
			
			if(mon1 == mon2 && date1 == date2) {
//				System.out.println("mon1: "  + mon1 + ",mon2: " + mon2);
//				System.out.println("date1: "  + date1 + ",date2: " + date2);
				return true;
			}
		}
		return false;
	}
	
}
