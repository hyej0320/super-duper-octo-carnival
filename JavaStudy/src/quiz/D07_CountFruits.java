package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class D07_CountFruits {

	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주세요
	final public static String[] FRUITS = 
		{"Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple",
				"Peach", "Watermelon", "Grape"};
	
	public static void main(String[] args) {
		
		String[] fruits = new String[1000];

		for (int i = 0 ; i < 1000; ++i) {
			fruits[i] = FRUITS[i];
		}
		System.out.println(Arrays.toString(fruits));
	}
}
