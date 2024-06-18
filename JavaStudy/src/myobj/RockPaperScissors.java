package myobj;

public class RockPaperScissors {
	
	int userNum;
	int comNum;
	int userResult;
	
	public void RockPaperScissors(int userNum) {
		
		while(true) {
			System.out.println("가위(0) 바위(1) 보(2)? > ");
			if (userNum == 0) {
				System.out.println("나는 가위!");
				break;
			} else if (userNum == 1) {
				System.out.println("나는 바위!");
				break;
			} else if (userNum == 2) {
				System.out.println("나는 보!");
				break;
			} else {
				System.out.println("잘못 입력하였습니다!!!!!!!!!");
				continue;
			}
		}
		
		
	}
//	
//	public void printUser(int userNum) {
//		
//		while(true) {
//			System.out.println("가위(0) 바위(1) 보(2) > ");
//			if (userNum == SCISSORS) {
//				System.out.println("가위!");
//				break;
//			} else if (userNum == ROCK) {
//				System.out.println("바위!");
//				break;
//			} else if (userNum == PAPER) {
//				System.out.println("보!");
//				break;
//			} else {
//				System.out.println("숫자를 다시 입력하세요");
//				continue;
//			}
//		}
//		
//	}

	
	
	
}
