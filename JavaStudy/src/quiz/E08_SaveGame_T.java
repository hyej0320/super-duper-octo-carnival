package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E08_SaveGame_T {

	public static void main(String[] args) {
		
		// 전적 불러오기
		File saveFile = new File("myfiles/rspgame.sav");
		
		int win;
		int lose;
		int draw;
		
		if (!saveFile.exists()) {
			// 파일이 존재하지 않으면 0부터 시작한다
			win = 0;
			lose = 0;
			draw = 0;
		} else {
			// 파일에 있는 전적을 읽어서 저장한다
			try (
					FileInputStream fin = new FileInputStream(saveFile);
					DataInputStream din = new DataInputStream(fin);
			){
				win = din.readInt();
				lose = din.readInt();
				draw = din.readInt();
			} catch (IOException e) {
				// 예외를 안전장치로 해두어야 함
				e.printStackTrace();
				win = 0;
				lose = 0;
				draw = 0;
			}
		}
		
		System.out.printf("게임 시작 전 불러들인 전적: %d승, %d무, %d패\n", win, draw, lose);
		
		// 캐릭터 타입으로 이모지 값을 활용할 수 있다
		char[] shapes = {0x270C, 0x270A, 0x270B}; // 유니코드에 들어가 있음
		Scanner sc = new Scanner(System.in);
		
		// 게임 진행하기
		for (int i = 0; i < 10; ++i) {
			System.out.printf("가위(0), 바위(1), 보(2) > ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);

			try {
				if (user == com) {
					System.out.printf("무승부입니다! (user:%c vs com:%c)\n", shapes[user], shapes[com]);
					++draw;
				} else if((user + 1) % 3 == com ) {
					System.out.printf("졌음ㅠ.ㅠ (user:%c vs com:%c)\n", shapes[user], shapes[com]);
					++lose;
				} else {
					System.out.printf("이겼다!!!!!!!! (user:%c vs com:%c)\n", shapes[user], shapes[com]);
					++win;
				} 
			} catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("[System] 0~2 사이의 숫자를 입력하세요!");

			}
		}
		
		// 전적 저장하기
		System.out.printf("게임이 10번 진행되고 난 후의 전적: %d승 %d무 %d패\n", win, draw, lose);
		
		
		try (
				FileOutputStream fout = new FileOutputStream(saveFile);
				DataOutputStream dout = new DataOutputStream(fout);
		){
			dout.writeInt(win);
			dout.writeInt(draw);
			dout.writeInt(lose);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
