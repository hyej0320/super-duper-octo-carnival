package quiz;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import myobj.RockPaperScissors;

public class E08_SaveGame {

	/*
		컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
		프로그램 종료 시 여태까지의 게임 전적을 파일에 저장해주세요
		
		프로그램 실행 시에는 파일에 저장되어 있는 전적 데이터를 읽어
		예전 기록이 계속해서 이어지도록 만들어보세요
	 */

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		try (
//				FileOutputStream fout = new FileOutputStream("myfiles/savegame.txt");
//				DataOutputStream dout = new DataOutputStream(fout);
//		){
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		int userWin;
		int userLose;
		int draw;
		
			while(true) {
				userWin = 0;
				userLose = 0;
				draw = 0;
				System.out.println("가위(0) 바위(1) 보(2)? > ");
				int userNum = sc.nextInt();
				if (userNum == 0) {
					System.out.println("나는 가위!");
				} else if (userNum == 1) {
					System.out.println("나는 바위!");
				} else if (userNum == 2) {
					System.out.println("나는 보!");
				} else {
					System.out.println("잘못 입력하였습니다!!!!!!!!!");
				}
				
				int comNum = (int)(Math.random() * 3);
				if (comNum == 0) {
					System.out.println("컴퓨터 가위!");
				} else if (comNum == 1) {
					System.out.println("컴퓨터 바위!");
				} else if (comNum == 2) {
					System.out.println("컴퓨터 보!");
				} 
				
				if (userNum == comNum) {
					System.out.println("비김");
					++draw;
				} else if (userNum == 0) {
					if (comNum == 1) {
						System.out.println("컴퓨터가 이김");
						++userLose;
					} else if (comNum == 2) {
						System.out.println("내가 이김");
						++userWin;
					} 
				} else if(userNum == 1) {
					if (comNum == 0) {
						System.out.println("내가 이김");
						++userWin;
					} else if (comNum == 2) {
						System.out.println("컴퓨터가 이김");
						++userLose;
					} 
				} else if(userNum == 2) {
					if (comNum == 0) {
						System.out.println("컴퓨터가 이김");
						++userLose;
					} else if (comNum == 1) {
						System.out.println("내가 이김");
						++userWin;
					} 
				}
				System.out.printf("승: %d\n패: %d\n무: %d\n", userWin, userLose, draw);
			}
		}
	}

