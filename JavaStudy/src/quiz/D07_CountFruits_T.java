package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruits_T {

	final public static String[] FRUITS = 
		{"Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple",
				"Peach", "Watermelon", "Grape"};
	
	public static void main(String[] args) {
		String[] randomFruits = new String[1000];
		
		for(int i = 0; i < randomFruits.length; ++i) {
			randomFruits[i] = FRUITS[(int)(Math.random() * FRUITS.length)];
		}

		// 과일 9개 x 배열 크기 1000번 = 총 9000번 반복
		for(int i = 0; i < FRUITS.length ; ++i) {
			System.out.print(FRUITS[i] + "의 개수: ");
			int count = 0;
			for(int j = 0; j < randomFruits.length ; ++j) {
				if(randomFruits[j].equals(FRUITS[i])); {
					++count;					
				}
			}
			System.out.println(count + "개");
		}
		
		List<String> randomFruitList = 
				new ArrayList<>(Arrays.asList(randomFruits));
		
		System.out.println("--- Collection.frequency()를 사용 ---");
		
		// 과일 9개 x frequency로 1000번씩 = 총 9000번 검사
		for (int i = 0; i < FRUITS.length; ++i) {
			String fruit = FRUITS[i];
			int count = Collections.frequency(randomFruitList, fruit);
			System.out.printf("%s의 개수: %d개\n", fruit, count);
		}
		
		System.out.println("------------ HashMap ------------");
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		// 반복을 1000번만 수행하면서 모든 과일의 개수를 셀 수 있다
		for (int i = 0; i < randomFruits.length; ++i) {
			String fruit = randomFruits[i];
			
			// 아직 없는 과일이라면 get()했을 때 null이 나온다
			// 이미 맵에 등록된 적 있는 과일이라면 개수가 나온다
			Integer count = fruitCount.get(fruit);
			
			if (count != null) {
				fruitCount.put(fruit, count + 1);
			} else {
				fruitCount.put(fruit, 1);
			}
		}
		System.out.println(fruitCount);
	}
}
