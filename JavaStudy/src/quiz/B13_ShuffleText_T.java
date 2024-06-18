package quiz;

import java.util.Scanner;

public class B13_ShuffleText_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		String spaceRemoved = "";
		
		for (int i = 0, len = text.length(); i < len ; ++i) {
			char ch = text.charAt(i);
			if (ch != ' ') {
				spaceRemoved += ch;
			}
		}
		
		char[] arr = new char[spaceRemoved.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = spaceRemoved.charAt(i);
		}
		
		// 섞기 (랜덤한 위치를 뽑으려 하면 같은 위치가 자꾸 걸려서 문제가 된다)
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = text.charAt[(int)(Math.random() * arr.length));
//		}
//		System.out.println(arr);
		
		// 화투처럼 섞기
		
		/*
			length : 5
				  0	   1    2    3    4	
			arr {'H', 'e', 'l', 'l', 'o'}
			
			temp '하'
		 */
		for (int i = 0; i < 1000; ++i) {			
			int randomIndex = (int)(Math.random() * (arr.length - 1)) + 1; // 0을 넣으면 어차피 0과 비교
			
			char temp = arr[0];
			arr [0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		System.out.println(arr);
	}
}
