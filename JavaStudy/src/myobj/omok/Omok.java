package myobj.omok;

import java.util.Scanner;

public class Omok {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] omok = new char[12][12];
		
		for(int i = 0; i < 12; ++i) {
			for (int j = 0; j < 12; ++j) {
				if(i == 0 && j == 0) {
					omok[i][j] = '┌';
				} else if(i == 11 && j == 11) {
					omok[i][j] = '┘';
				} else if(i == 0 && j == 11) {
					omok[i][j] = '┐';
				} else if(i == 11 && j == 0) {
					omok[i][j] = '└';
				} else if(i == 0) {
					omok[i][j] = '┬';
				} else if(j == 0) {
					omok[i][j] = '├';
				} else if(i == 11) {
					omok[i][j] = '┴';
				} else if(j == 11) {
					omok[i][j] = '┤';
				} else {
					omok[i][j] = '┼';
				}
				System.out.printf("%-2c", omok[i][j]);
			}
			System.out.println();

		}
		
		System.out.println("돌 놓을 좌표(x, y) 입력 > ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for (int i = 0; i < omok.length; ++i) {
			for (int j = 0; j < omok[i].length; ++j) {
				System.out.printf("%-2c", omok[i][j]);
				if (omok[i][j] == omok[x][y]) {
					omok[x][y] = '●';
					break;					
				}
			}
			System.out.println();
		}
			
		

		
	}
	
	public Omok(int x, int y) {

	}
}

	


