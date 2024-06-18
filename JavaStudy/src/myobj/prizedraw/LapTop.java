package myobj.prizedraw;

public class LapTop extends Prize {

	@Override
	public String prizeName() {
		return "노트북";
	}
	
	@Override
	public int getQty() {
		return 5;
	}
	
	@Override
	public int getPrice() {
		return 2000000;
	}

	@Override
	public double getProbability() {
		return (getQty() / totalPrizeQty) * 100.0 ;
	}
}

