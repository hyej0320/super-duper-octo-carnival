package myobj;

import java.util.Scanner;

public class ThirtyOneGame {
	int endNum;
	int[] playNum = new int[endNum];
	int count = 0;
	int userNum;
		
	public ThirtyOneGame() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("진행될 게임의 숫자를 입력해주세요! > ");
		endNum = sc.nextInt();
		
		
		for(int i = 0; i < playNum.length; ++i) {
			playNum[i] = i + 1;
		}
	}
	
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 몇 개 입력하겠습니까? > ");
		int userNum = sc.nextInt();
		
		for (int i = 0; i < endNum; ++i) {
			if (userNum > 3 || userNum < 1) {
				System.out.println("[경고] 숫자는 1 ~ 3만 입력해주세요!");
				break;
			} else {
				
			}
			
		}
		
	}
	
	
	
	
	public void printUserNum() {
		System.out.print("user : ");
		for(int j = 0; j < userNum; ++j) {
			System.out.print(count + 1 + " ");
			++count;
		}
		System.out.println();
		
		
	}
	
	public void endGame() {
		for(int i = 0; i < endNum ; ++i) {
			System.out.print(count + " ");
			
			if(count == endNum) {
				System.out.println("패!");
				break;
		}

		}
	}
	
}
