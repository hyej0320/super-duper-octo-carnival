package quiz;

import myobj.ThirtyOneGame;

public class C07_31Game {
	/*
		# 31 Game
		
		- 프로그램을 시작하면 게임에 참여하는 인원과 마지막 숫자를 설정한다
		- 이전 사람이 골랐던 숫자부터 +1 ~ +3씩 더할 수 있다
		- 게임을 진행하다가 마지막 숫자를 입력하게 되는 사람이 패배한다
	 */
	public static void main(String[] args) {
		ThirtyOneGame game = new ThirtyOneGame();
		game.userInput();

		
	}
}
