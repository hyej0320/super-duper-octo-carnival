package myobj.prizedraw;

public class TV extends Prize {

	@Override
	public String prizeName() {
		return "TV";
	}
	
	@Override
	public int getQty() {
		return 2;
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

