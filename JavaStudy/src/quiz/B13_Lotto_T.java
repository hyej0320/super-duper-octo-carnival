package quiz;

public class B13_Lotto_T {

	public static void main(String[] args) {
		
		int currIndex = 0;
		
		int[] winNums = new int[7];
		
		while (currIndex < 7) {
			int num = (int)(Math.random() * 45 + 1);
			
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					// 이전에 뽑은 숫자 중에 중복되는 숫자가 있음
					repeated = true;
					break;
				}
			}
			// 중복된 숫자가 존재한다면 currIndex가 증가하지 않기 때문에
			// 현재 인덱스에 숫자를 다시 뽑게 된다
			if (!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}
		}
		
		for (int i = 0; i < winNums.length; ++i) {
			System.out.print(winNums[i] + " ");
			
		}
		System.out.println();
	}
}
