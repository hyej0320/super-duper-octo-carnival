package quiz;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class D02_Jiphap {

	/*
		1. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		   [1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
		 
		2. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		   [1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
		   
		3. 두 컬렉션을 매개변수로 전달받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
		   [1, 2, 3] - [2, 3, 4, 5] => [1]
		   [2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 */
	

	
	
	public void union(){
		
	}	
	
	public static void main(String[] args) {
		Collection<Integer> num1 = new HashSet<>();
		Collection<Integer> num2 = new HashSet<>();
		
		num1.add(1);
		num1.add(2);
		num1.add(3);
		
		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);
		
		num1.addAll(num2);
		System.out.println(num1);


	}
}