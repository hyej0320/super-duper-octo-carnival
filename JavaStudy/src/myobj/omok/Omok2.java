package myobj.omok;

import java.util.Scanner;

public class Omok2 {
	
	private int x;
	private int y;
	private int type;
	
	public void input(int x, int y) {
		System.out.println("돌 놓을 좌표(x, y) 입력 > ");
		Scanner sc = new Scanner(System.in);
		this.x = sc.nextInt();
		this.y = sc.nextInt();
	}
	
}

	


