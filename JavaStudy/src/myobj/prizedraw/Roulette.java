package myobj.prizedraw;

public class Roulette {
	

	PrizeGenerator[] prize;
	int total;
	double rate;
	
	public Roulette() {
	
		PrizeGenerator[] prize = new PrizeGenerator[6];
		
		prize[0] = new PrizeGenerator("TV", 1, 2000000);
		prize[1] = new PrizeGenerator("노트", 5, 1500000);
		prize[2] = new PrizeGenerator("스마트폰", 10, 1000000);
		prize[3] = new PrizeGenerator("에어프라이어", 20, 200000);
		prize[4] = new PrizeGenerator("기프트카드", 100, 10000);
		prize[5] = new PrizeGenerator("커피교환권", 150, 5000);
		
		
	}
	
	
	public int getTotal() {
		for(int i = 0; i < 6; ++i) {
			total += prize[i].qty; 
		}
		return total;
	}

}
