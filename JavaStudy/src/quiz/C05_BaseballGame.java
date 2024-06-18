package quiz;

import java.util.Arrays;

import myobj.BaseballGame;

public class C05_BaseballGame {

	/*
		# 숫자 야구 게임
		
		1. 게임이 시작되면 정답이 랜덤으로 생성된다
		   (정답은 랜덤 4자리의 중복없는 숫자)
		   
		2. 플레이어에게는 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다
		
		3. 플레이어가 입력한 숫자의 번호와 위치가 정답의 것과 모두 일치하면 스트라이크
		
		4. 플레이어가 입력한 숫자는 맞고 위치가 다르면 볼
		
		5. 9번의 기회 안에 모든 숫자와 위치를 맞추면 플레이어의 승리
		
		6. 모든 기회 소진 시 플레이어의 패배
		
		ex) 정답이 2591인 경우
			플레이어가 2988이라고 입력하면 1strike 1ball
		
	 */
	
	public static void main(String[] args) {
		int[] answerNum = new int[4];
		int[] inputNum = new int[4];
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < answerNum.length; ++i) {
			answerNum[i] = (int)(Math.random() * 9 + 1);
			for (int j = 0; j < i; ++j) {
				if (answerNum[j] == answerNum[i]) {
					--i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(answerNum));
		
		
		for(int i = 0; i < inputNum.length; ++i) {
//			inputNum[i] = (int)
		}
	}
}
