package myobj.omok;

public class OmokBoard {
	
	char[][] board;
	
	public OmokBoard() {
		board = new char[12][12];
		
		for(int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				if(i == 0 && j == 0) {
					board[i][j] = '┌';
				} else if(i == 11 && j == 11) {
					board[i][j] = '┘';
				} else if(i == 0 && j == 11) {
					board[i][j] = '┐';
				} else if(i == 11 && j == 0) {
					board[i][j] = '└';
				} else if(i == 0) {
					board[i][j] = '┬';
				} else if(j == 0) {
					board[i][j] = '├';
				} else if(i == 11) {
					board[i][j] = '┴';
				} else if(j == 11) {
					board[i][j] = '┤';
				} else {
					board[i][j] = '┼';
				}
			}
		}
	}
	
	public void printBoard() {
		for(int i = 0; i < board.length; ++i) {
			for(int j = 0; j < board[i].length; ++j) {
				System.out.printf("%-2c", board[i][j]);
			}
			System.out.println();
		}
	}
}