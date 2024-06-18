package myobj;

public class BaseballGameResult_T {

	int strike;
	int ball;
	
	public BaseballGameResult_T(int strike, int ball) {
		this.strike = strike;
		this.ball = ball;
	}
	
	public int getStrike() {
		return strike;
	}
	
	public int getBall() {
		return ball;
	}
}
