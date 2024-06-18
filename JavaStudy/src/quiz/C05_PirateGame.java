package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.PirateGame;

public class C05_PirateGame {

	/*
		통아저씨 게임을 만들어보세요
		
		1. 게임이 시작되면 꽝 자리가 정해진다
		
		2. 플레이어는 아저씨가 튀어나올 때까지 돌아가면서 계속 자리를 선택해야 한다
		   (플레이어는 4명으로 고정한다)
		
		3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
		   (꽝의 위치는 매 판 시작 시 랜덤으로 설정된다)
		   
		4. 아저씨가 발사되면 해당 플레이어의 점수를 깎고 나머지의 점수를
		   찌르는 데 성공한 횟수에 비례하여 증가시킨다
		   
		5. 각 게임이 끝날 때 순위에 따라 소지금이 변동된다 
		   (1위 +1000, 2위 +500, 3위 -500, 4위 -1000)
		
		6. 게임을 그만하겠다고 하거나 또는 한 사람의 점수가 -가 된다면 게임이 종료된다
		   게임이 종료되면서 최종 스코어를 출력해준다 (이름, 점수, 남은 소지금(+얼마 벌었나) 등)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PirateGame game = new PirateGame();
		
		while (true) {	
			// 사용자가 자리 선택한거를 보여주기
			game.printHole();
			System.out.println("\n위치를 번호로 입력하세요 : ");
			int num = sc.nextInt();
			
			// 사용자가 꽝 자리를 선택했을 때 break;
			game.stab(num);
			
			if (game.bomb) {
				System.out.printf("꽝! 해적은 %d번만에 잡혔습니다!", game.count);
				break;
			}
		}
	}
}