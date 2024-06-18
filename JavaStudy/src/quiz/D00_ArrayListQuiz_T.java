package quiz;

import java.util.ArrayList;

public class D00_ArrayListQuiz_T {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1000 + 1000));
		}
		
		System.out.println(numbers);
		
		int i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
				continue;
			}
			++i;
		}
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		
		i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 != 0) {
				numbers.remove(i);
				continue;
			}
			++i;
		}
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		

		// 리스트를 활용해 짝수 리스트와 홀수 리스트를 만들어 처리하기
		ArrayList<Integer> origin = new ArrayList<>();
		
		for (i = 0; i < 100; ++i) {
			origin.add((int)(Math.random() * 1000 + 1000));
		}
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		int len = origin.size();
		for (i = 0; i < len; ++i) {
			switch (origin.get(i) % 2) {
				case 0:
					even.add(origin.get(i));
					break;
				case 1:
					odd.add(origin.get(i));
					break;
			}
		}
		System.out.println("원본: " + origin);
		System.out.println("짝수: " + even);
		System.out.println("홀수: " + odd);
	}
}
