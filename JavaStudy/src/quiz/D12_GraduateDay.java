package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class D12_GraduateDay {

	/*
		사용자가 수업을 시작하는 날짜와 수업을 받아야하는 날을 입력하면
		수업을 쉬는 날을 모두 출력해주고
		수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요
		
		쉬는 날 - 토, 일, 공휴일(대체 휴일 포함)
	 */

	static int startYear;
	static int startMonth;
	static int startDate;
	static int date;
	
	public D12_GraduateDay(int startYear, int startMonth, int startDate, int date) {
		this.startYear = startYear;
		this.startMonth = startMonth;
		this.startDate = startDate;
		this.date = date;
		
	}
	
	public void startClass() {
		Calendar startClass = Calendar.getInstance();
		startClass.set(Calendar.YEAR, startYear);
		startClass.set(Calendar.MONTH, startMonth - 1);
		startClass.set(Calendar.DATE, startDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = sdf.format(startClass.getTime());
		System.out.println(result);
		
		
		
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
	
		List<Calendar> bankHolidayList = new ArrayList<>();
		
		Collections.addAll(bankHolidayList, new_years, lunar_new_year1, lunar_new_year2,
		lunar_new_year3, lunar_new_year4, IndependenceMovement, childrens1,
		childrens2, buddhasBirthday, memorial, liberation, thanksGiving1, 
		thanksGiving2, thanksGiving3, national_foundation, hangeul, christmas);
		
		
		for (int i = 0; i < bankHolidayList.size(); ++i) {

			if (bankHolidayList.get(i).after(startClass)) {
				System.out.printf("\n%d년 %d월 %d일", 
						bankHolidayList.get(i).get(Calendar.YEAR), 
						bankHolidayList.get(i).get(Calendar.MONTH), 
						bankHolidayList.get(i).get(Calendar.DATE));
			}
			
		}
	
		
	}
	
	
	
		
	
	private Calendar get(int sunday) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		startYear = sc.nextInt();
//		startMonth = sc.nextInt();
//		startDate = sc.nextInt();
//		date = sc.nextInt();
		startYear = 2024;
		startMonth = 4;
		startDate = 16;
		date = 120;
		D12_GraduateDay graduate = new D12_GraduateDay(startYear, startMonth, startDate, date);
		graduate.startClass();

		
		
		
	}	
}
