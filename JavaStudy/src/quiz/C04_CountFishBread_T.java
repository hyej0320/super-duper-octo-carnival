package quiz;

import java.util.Arrays;

import myobj.FishBread_T;

public class C04_CountFishBread_T {

	public static void main(String[] args) {
		
		// 붕어빵 100개 만들기
		FishBread_T[] breads = new FishBread_T[100];
		
		for (int i = 0; i < 100; ++i) {
			breads[i] = new FishBread_T();
		}
		
		int[] flavorCount = new int[FishBread_T.kindOfFlavors];
		for (int i = 0; i < breads.length; ++i) {
			flavorCount[breads[i].flavor] += 1;
		}
		
		System.out.println(Arrays.toString(flavorCount));

		System.out.println("총 가격: " + FishBread_T.getTotalPrice(breads));
	}
	
	
}
