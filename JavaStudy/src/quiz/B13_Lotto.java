package quiz;

import java.util.Arrays;

public class B13_Lotto {

	/*
		1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호를 만들어보세요
		
		1. 숫자를 랜덤으로 뽑는다
		2. 뽑았으면 이전에 뽑았던 숫자 중에 방금 뽑은 숫자가 없는지 확인한다
		3. 있으면 다시 뽑고 없으면 넘어간다
	 */
	
	public static void main(String[] args) {
		
		int currIndex = 0;
		int[] winNums = new int[7];

		while(currIndex < 7) {
			int num = (int)(Math.random() * 45 + 1);
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					repeated = true;
					break;
				} 
			}
			if (!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}
		}
		for (int i = 0; i < winNums.length; ++i) {
			System.out.print(winNums[i] + " ");
		}
	}
	
}