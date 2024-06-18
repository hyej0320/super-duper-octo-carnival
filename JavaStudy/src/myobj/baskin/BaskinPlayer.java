package myobj.baskin;

public class BaskinPlayer {
	int playerSize;
	
	public BaskinPlayer(int playerSize) {
		this.playerSize = playerSize;
	}
	
	public int getPlayerNum(int turn) {
		return turn % playerSize + 1;
		// turn % playerSize + 1 : turn의 횟수와 플레이어를 나눴을 때 0, 1, 2, ... 순서로 나옴
		// 1을 더하는 이유는 1번부터 시작하기 위함!
	}
	
}
