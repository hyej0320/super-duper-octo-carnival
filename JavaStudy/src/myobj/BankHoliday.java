package myobj;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class BankHoliday {
	
	public BankHoliday() {
		
		Calendar new_years= Calendar.getInstance();
		Calendar lunar_new_year1 = Calendar.getInstance();
		Calendar lunar_new_year2 = Calendar.getInstance();
		Calendar lunar_new_year3 = Calendar.getInstance();
		Calendar lunar_new_year4 = Calendar.getInstance();
		Calendar IndependenceMovement= Calendar.getInstance();
		Calendar childrens1= Calendar.getInstance();
		Calendar childrens2 = Calendar.getInstance();
		Calendar buddhasBirthday = Calendar.getInstance();
		Calendar memorial = Calendar.getInstance();
		Calendar liberation = Calendar.getInstance();
		Calendar thanksGiving1 = Calendar.getInstance();
		Calendar thanksGiving2= Calendar.getInstance();
		Calendar thanksGiving3= Calendar.getInstance();
		Calendar national_foundation = Calendar.getInstance();
		Calendar hangeul = Calendar.getInstance();
		Calendar christmas = Calendar.getInstance();
		
		
		new_years.set(2024, 1, 1);
		lunar_new_year1.set(2024, 2, 9);
		lunar_new_year2.set(2024, 2, 10);
		lunar_new_year3.set(2024, 2, 11);
		lunar_new_year4.set(2024, 2, 12);
		IndependenceMovement.set(2024, 3, 1);
		childrens1.set(2024, 5, 5);
		childrens2.set(2024, 5, 6);
		buddhasBirthday.set(2024, 5, 15);
		memorial.set(2024, 6, 6);
		liberation.set(2024, 8, 15);
		thanksGiving1.set(2024, 9, 16);
		thanksGiving2.set(2024, 9, 17);
		thanksGiving3.set(2024, 9, 18);
		national_foundation.set(2024, 10, 3);
		hangeul.set(2024, 10, 9);
		christmas.set(2024, 12, 25);
	
		ArrayList<Calendar> bankHolidays = new ArrayList<>();
		
		
	}
	
	
	@Override
	public String toString() {
		return String.format("%d년 %d월 %d일: %s");
	}



}
