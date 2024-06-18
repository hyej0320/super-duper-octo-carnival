import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator {
	/*
	 	# Comparable
	 	
	 	- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다
	 	- compareTo() 메서드를 구현해두면 크기 비교가 필요한 상황에서
	 	  해당 메서드를 호출해 크기를 비교할 수 있게 된다
	 	
	 	# Comparator
	 	
	 	- 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
		- 이 인터페이스를 구현한 클래스의 인스턴스를 필요한 상황에서 함께 전달할 수 있다
	 */
	
	public static void main(String[] args) {
		// Wrapper 클래스들은 Comparable이 이미 구현되어 있으므로
		// compareTo() 메서드를 직접 구현할 필요가 없다
		List<Integer> nums = new ArrayList<>();
		List<String> countries = new ArrayList<>();
		
		Collections.addAll(nums, 88, 1, 99, 89, 90, 15, 10, 11, 12, 13);
		
		Collections.sort(nums);
		
		System.out.println(nums);
		
		List<Grape> grapes = new ArrayList<>();
		grapes.add(new Grape("김씨네 농장", 33, 5.8, "C-"));
		grapes.add(new Grape("강씨네 농장", 33, 5.1, "D"));
		grapes.add(new Grape("한씨네 농장", 33, 6.8, "B-"));
		grapes.add(new Grape("유씨네 농장", 33, 4.8, "D-"));
		grapes.add(new Grape("이씨네 농장", 28, 7.7, "A-"));
		grapes.add(new Grape("박씨네 농장", 40, 8.1, "A"));
		grapes.add(new Grape("최씨네 농장", 35, 6.6, "B-"));
		grapes.add(new Grape("최씨네 농장", 20, 8.8, "A+"));

		
		// sort()를 할 수 있으려면 리스트에 속한 
		// 모든 요소들이 Comparable(비교 가능)이 구현되어 있어야 한다
		// Collections.sort(grapes);
		
		// Comparator를 함께 전달하면 Comparable의 compareTo() 대신
		// Comparator의 compare()를 사용하여 정렬한다
		// Collections.sort(grapes, new 포도분류기_당도기준내림차순());
		
		// Comparator를 구현받은 익명의 분류기를 전달한다
		Collections.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {
				if (g1.grade == g2.grade) {
					return 0;
				} else if (g1.sweet > g2.sweet) {
					return 1;
				} else {
					return -1;					
				}
			}
		});
		
		System.out.println(grapes);
	}
}

// Comparable 인터페이스를 구현한 클래스는 각 인스턴스끼리의 크기 비교가 가능해진다
// (-> 정렬이 가능해진다)
class Grape implements Comparable<Grape>{
	String farmName;
	int qty;
	double sweet;
	String grade;
	
	public Grape(String farmName, int qty, double sweet, String grade) {
		this.farmName = farmName;
		this.qty = qty;
		this.sweet = sweet;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return String.format("[%s/%d알/%.1f/%s]\n", farmName, qty, sweet, grade);
		
	}
	
	@Override
	public int compareTo(Grape g) {
		// 현재 인스턴스와 매개변수로 전달받은 인스턴스를 비교하였을 때
		// 어떤 것이 더 크다고 판정할 것인지 정해야 한다
		
		// 두 인스턴스의 크기가 같다 : 0을 리턴
		// 현재 인스턴스의 크기가 더 크다(리스트의 뒤쪽에 있었으면 좋겠다) : 1을 리턴
		// 매개변수 인스턴스의 크기가 더 크다(리스트의 앞쪽에 있었으면 좋겠다) : -1을 리턴
		
		// 예시 : 포도알 개수를 기준으로 두 인스턴스의 크기를 비교
		if (this.qty == g.qty) {
			// 포도알 개수가 같으면 당도를 기준으로 크기를 비교
			if (this.sweet == g.sweet) {
				return 0;
			} else if (this.sweet > g.sweet) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.qty > g.qty) {
			return 1;
		} else {
			return -1;
		}
	}
}
// 내림차순 정렬: 큰 값 먼저 나오는 것 
// 오름차순 정렬: 작은 값이 먼저 나오는 것
class 포도분류기_당도기준내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape g1, Grape g2) {
		// 왼쪽 것이 더 클 때 (왼쪽 것이 뒤쪽에 나오고 싶을 때) : 1
		// 오른쪽 것이 더 클 때 (오른쪽 것이 뒤쪽에 나오고 싶을 때): -1
		// 두 인스턴스의 크기가 같을 때 : 0
		if(g1.sweet == g2.sweet) {
			return 0;
		} else if(g1.sweet > g2.sweet) {
			return -1;
		} else {
			return 1;			
		}
	}
}

/*
	연습1: 복숭아 클래스를 정의해보세요
		  복숭아는 가격, 등급, 무게, 농장이름을 필드로 가지고 있습니다
		  (등급은 +, -를 매길 수 있음)
		  
	연습2: 복숭아를 크기 비교가 가능한 객체로 만들어보세요 (무게 기준)
	
	연습3: 복숭아를 등급 기준으로 내림차순 정렬하고, 등급이 같은 경우 가격 기준으로 내림차순 정렬해보세요
	
	연습4: 복숭아를 농장이름 순으로 오름차순 정렬하고 농장이름이 같은 경우
		  등급 기준으로 내림차순 정렬해주세요
*/