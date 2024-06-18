package myobj;

public class PirateGame {

	int[] hole;
	
	public int count = 0;
	public boolean bomb = false;

	public PirateGame() {
		hole = new int[20];
		hole[0] = -1;
		hole[1] = -1;
		hole[2] = -1;
		hole[3] = -1;
		shuffle();
	}

	public void shuffle() {
		for (int i = 0; i < 1000; ++i) {
			int ran = (int) (Math.random() * hole.length);
			int temp = hole[ran];
			hole[ran] = hole[0];
			hole[0]= temp;		
		}		
	}

	public void printHole() {
		for(int i = 0; i < hole.length; ++i) {
			
			if (hole[i] == -1 || hole[i] == 0) {
				System.out.print("X\t");
			} else {
				System.out.print("O\t");
			}
		}
	}
	
	public void stab(int num) {
		if (hole[num] == -1) {
			++count;
			bomb = true;
		} else if (hole[num] == 0) {
			++count;
			hole[num] = 1;
		} else {
			System.out.println("이미 선택한 위치입니다.");
		}
	}
}