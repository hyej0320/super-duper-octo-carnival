package quiz;

import java.util.Scanner;

import myobj.baskin.BaskinGame;
import myobj.baskin.BaskinGame2;
import myobj.baskin.BaskinPlayer;

public class C07_31Game_T {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("참여하려는 인원은 몇 명? > ");
		int playerSize = sc.nextInt();
		System.out.print("이 게임의 마지막 숫자는? > ");
		int lastNum = sc.nextInt();
		
		BaskinGame game = new BaskinGame2(lastNum);
		BaskinPlayer player = new BaskinPlayer(playerSize);
		
		int turn = 0;
		
		while(true) {

			int playerNum = player.getPlayerNum(turn);
			System.out.printf("플레이어%d의 차례  > ", playerNum);
			int result = game.next(sc.nextInt());
			
			if (result == -1) {
				System.out.println("[경고] 1 ~ 3 사이의 숫자를 입력해주세요");
				continue;
			} else if (result == -2) {
				System.out.println("[경고] 그 숫자는 더할 수 없습니다");
				continue;
			}
			
			System.out.printf("플레이어%d > %d!\n", playerNum, result);
			
			if(game.isEnd()) {
				System.out.printf("플레이어%d님의 패배입니다!\n", playerNum);
				break;
			}
			
			++turn;
		}
	}
}
