package quiz;

import java.util.HashSet;

public class D01_LottoSet_T {
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 7) {
			lotto.add((int)(Math.random() * 45 + 1));			
		} 
		System.out.println(lotto);
	}
}
