package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Jiphap_T {

	public static Set union(Collection a, Collection b) {
		
		// 전달된 원본을 훼손시키는 방법
//		a.addAll(b);
//		Set union = new HashSet(a);
		
		// 원본이 훼손되지 않도록 비어있는 Set을 만들어준 후 사용
		Set union = new HashSet();
		
		union.addAll(a);
		union.addAll(b);
		
		return union;
	}
	
	
	public static Set interSection(Collection a, Collection b) {
		Set interSection = new HashSet();
		
		interSection.addAll(a);
		interSection.retainAll(b);
		
		return interSection;
	}
	
	
	public static Set difference(Collection a, Collection b) {
		Set difference = new HashSet();
		
		difference.addAll(a);
		difference.removeAll(b);
		return difference;
		
		
	}
	public static void main(String[] args) {
		List<String> snack1 = new ArrayList<>();
		Set<String> snack2 = new HashSet<>();
		
		snack1.add("초코파이");
		snack1.add("웨하스");
		snack1.add("쿠크다스");
		
		snack2.add("쿠크다스");
		snack2.add("오예스");
		snack2.add("포스틱");

		
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();
		
		num1.add(1);
		num1.add(2);
		num1.add(3);
		
		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);
		
		System.out.println(num1 + " VS " + num2);
		System.out.println(snack1 + " VS " + snack2);
		
		Set unionResult = union(num1, num2);
		Set unionResult2 = union(snack1, snack2);
		
		System.out.println("#### 합집합 ####");
		System.out.println(unionResult);
		System.out.println(unionResult2);
		
		Set interResult = interSection(num1, num2);
		Set interResult2 = interSection(snack1, snack2);

		System.out.println("#### 교집합 ####");
		System.out.println(interResult);
		System.out.println(interResult2);
		
		Set differResult = difference(num1, num2);
		Set differResult2 = difference(num2, num1);
		
		Set differResult3 = difference(snack1, snack2);
		
		System.out.println("#### 차집합 ####");
		System.out.println(differResult);
		System.out.println(differResult2);
		System.out.println(differResult3);
	}
}
