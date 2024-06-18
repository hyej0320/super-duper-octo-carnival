package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Peach {

/*
	연습1: 복숭아 클래스를 정의해보세요
		  복숭아는 가격, 등급, 무게, 농장이름을 필드로 가지고 있습니다
		  (등급은 +, -를 매길 수 있음)
		  
	연습2: 복숭아를 크기 비교가 가능한 객체로 만들어보세요 (무게 기준)
	
	연습3: 복숭아를 리스트에 넣고 등급 기준으로 내림차순 정렬하고, 
		  등급이 같은 경우 가격 기준으로 내림차순 정렬해보세요
	
	연습4: 복숭아를 농장이름 순으로 오름차순 정렬하고 농장이름이 같은 경우
		  등급 기준으로 내림차순 정렬해주세요
*/
	public static void main(String[] args) {
		List<Peach> peaches = new ArrayList<>();
		peaches.add(new Peach(800, "D", 1.2, "김씨네"));
		peaches.add(new Peach(810, "D-", 1.3, "김씨네"));
		peaches.add(new Peach(920, "C-", 1.0, "이씨네"));
		peaches.add(new Peach(830, "C+", 1.2, "이씨네"));
		peaches.add(new Peach(900, "B+", 1.4, "이씨네"));
		peaches.add(new Peach(890, "B-", 1.4, "한씨네"));
		peaches.add(new Peach(910, "B-", 1.4, "이씨네"));
		peaches.add(new Peach(930, "A-", 1.5, "박씨네"));
		peaches.add(new Peach(1000, "A-", 1.5, "김씨네"));
		peaches.add(new Peach(780, "A+", 1.5, "유씨네"));
		peaches.add(new Peach(740, "A+", 1.5, "박씨네"));
		
		Collections.sort(peaches);
		System.out.println(peaches);

		Collections.sort(peaches, new Grade());
		System.out.println(peaches);

		Collections.sort(peaches, new Farm());
		System.out.println(peaches);
		
	}
}

class Peach implements Comparable<Peach> {
	int price;
	String grade;
	double weight;
	String farmName;

	
	public Peach(int price, String grade, double weight, String farmName) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farmName = farmName; 
	}
	

	@Override
	public String toString() {
		return String.format(" %s/ %d원/ %.1fkg / %s\n" , farmName, price, weight, grade);
	}
	
	// 무게 기준 정렬 
	@Override
	public int compareTo(Peach p) { 
		if (this.weight == p.weight) {
			return 0;
		} else if (this.weight > p.weight) {
			return 1;
		} else {
			return -1;			
		}
	}
	
}

class Grade implements Comparator<Peach> {
	@Override
	public int compare(Peach p1, Peach p2) {
		if (p1.grade.compareTo(p2.grade) == 0) {
			if (p1.price == p2.price) {
				return 0;
			} else if (p1.price > p2.price) {
				return -1;
			} else {
				return 1;
			}
		} else if (p1.grade.compareTo(p2.grade) > 0) {
			return -1;
		} else {
			return 1;					
		}
	}
}

class Farm extends Grade implements Comparator<Peach> {
	
	@Override
	public int compare(Peach p1, Peach p2) {
		
		if(p1.farmName.compareTo(p2.farmName) == 0) {		
			return 0;
		} else if (p1.farmName.compareTo(p2.farmName) > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}

