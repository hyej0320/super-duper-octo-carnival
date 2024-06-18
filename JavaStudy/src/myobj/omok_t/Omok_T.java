package myobj.omok_t;

public class Omok_T {
	
	final static char[] OMOK_CHARS = 
		{'┼', '┌', '┬', '┐', '├', '┤', '└', '┴', '┘', '╋', '●', '○'};
	// 위의 캐릭터 배열 위치에 기반해서 번호를 지정 '●' = OMOK_CHARS[10], '○' = OMOK_CHARS[11]
	final public static int BLACK_STONE = 10;
	final public static int WHITE_STONE = 11;
	
	final static int BOARD_WIDTH = 15;
	final static int BOARD_HEIGHT = 15;
	
	int[][] board;
	
	public Omok_T() {
		board = new int[][] {
			{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8},
		};
	}
	
	// 놓기 전에 진행하는 체크 (3x3 같은 것...)
	public int preCheck(int x, int y, int stone) {
		return 0;
	}
	
	// 놓은 후에 진행하는 체크 (승리 여부)
	public int postCheck(int x, int y, int stone) {
		// 가로로 연속으로 놓여있는 돌의 개수를 세기
		int count = 0;
		// 방금 놓은 위치로부터 가로 오른쪽으로 가면서 같은 색상의 돌의 개수를 센다
		for(int i = x; i < BOARD_WIDTH; ++i) {
			if(board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		// 왼쪽으로 가면서 같은 색상의 돌의 개수를 센다 (방금 놓은 위치 미포함)
		for(int i = x - 1; i >= 0; --i) {
			if(board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if(count == 5) {
			return 1; // 승리
		}
		
		count = 0;
		
		// 세로로 연속으로 놓여있는 돌의 개수를 세기
		for (int i = y; i < BOARD_HEIGHT; ++i) {
			if(board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		for (int i = y - 1; i >= 0; --i) {
			if(board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if(count == 5) {
			return 2;
		}
		
		// 대각선
		count = 0;

		for (int i = y; i < BOARD_HEIGHT; ++i) {
			for (int j = x; j < BOARD_WIDTH; ++j) {
				if(board[i][j] == stone) {
					++count;
				} else {
					break;
				} 
			}
		}
		
		for (int i = y - 1; i >= 0; --i) {
			for (int j = x - 1; j >= 0; --j) {
				if(board[i][j] == stone) {
					++count;
				} else {
					break;
				}
			}
		}		
		if(count == 5) {
			return 3;
		}
			
		return 0;// 아무것도 아님
	}
	
	public boolean putBlack(int x, int y) {
		return putStone(x, y, BLACK_STONE);
	}
	
	public boolean putWhite(int x, int y) {
		return putStone(x, y, WHITE_STONE);
	}
	
	private boolean putStone(int x, int y, int stone) {
		if(x >= BOARD_WIDTH || x < 0 || y >= BOARD_HEIGHT || y < 0) {
			System.out.printf("[SYSTEM] 돌을 놓을 수 없는 위치입니다. (%d, %d)\n", x, y);
			return false;
		}

		int v = board[y][x];
		if (v != BLACK_STONE && v != WHITE_STONE) { // 중복 제거
			board[y][x] = stone;
			return true;
		} else {
			System.out.printf("[SYSTEM] 이미 돌이 놓여있는 위치입니다. (%d, %d)\n", x, y);
			return false;
		}
	}


	public void printBoard() {
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				System.out.printf("%2c", OMOK_CHARS[board[i][j]]);
				
//				if(board[i][j] == 1) {
//					System.out.printf("%2c", '┌');
//				} else if(board[i][j] == 2) {
//					System.out.printf("%2c", '┬');
//				} else if(board[i][j] == 3) {
//					System.out.printf("%2c", '┐');
//				} else if(board[i][j] == 4) {
//					System.out.printf("%2c", '├');
//				} else if(board[i][j] == 5) {
//					System.out.printf("%2c", '┤');
//				} else if(board[i][j] == 6) {
//					System.out.printf("%2c", '└');
//				} else if(board[i][j] == 7) {
//					System.out.printf("%2c", '┴');
//				} else if(board[i][j] == 8) {
//					System.out.printf("%2c", '┘');
//				} else if(board[i][j] == 9) {
//					System.out.printf("%2c", '╋');
//				} else {
//					System.out.printf("%2c", '┼');
//				}
			}
			System.out.println();

		}
	}
}
