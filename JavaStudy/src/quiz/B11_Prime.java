package quiz;

import java.util.Scanner;

public class B11_Prime {

	/*
		사용자가 정수를 입력하면 
		1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
		
		※ 소수(prime): 약수가 1과 자기 자신밖에 없는 수(2, 3, 5, 7, 11, 13, ..)
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		System.out.printf("1과 %d 사이에 존재하는 소수: 2 ", num);
		for (int i = 3; i <= num ; ++i) {
			int cnt = 0;
			for (int j = 1; j <= i ; ++j) {
				if (i % j == 0) {
					++cnt;
				}
			}
			
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		
//		int cnt = 0;
//		for(int i = 2; i <= num; i++) { // 소수에 1 포함 아님
//            int j; //
//            for(j = 2; j <= i; j++) {
//                cnt++;
//                if(i % j == 0) {
//                	 break;
//                }
//            }
//            if(i == j)
//                System.out.print(i + " ");
//        }
//		
//		int i = 1;
//		while (i <= num) {
//			if (num % i == 1 && num % i == num) {
//				System.out.print(" " + num);
//			} 
//		}
	}
}
