package myobj.prizedraw;

public class SmartPhone extends Prize {

	@Override
	public String prizeName() {
		return "스마트폰";
	}
	
	@Override
	public int getQty() {
		return 10;
	}
	
	@Override
	public int getPrice() {
		return 1000000;
	}

	@Override
	public double getProbability() {
		return (getQty() / totalPrizeQty) * 100.0 ;
	}
}
