package myobj.prizedraw;

public class AirFryer extends Prize {

	@Override
	public String prizeName() {
		return "에어프라이어";
	}
	
	@Override
	public int getQty() {
		return 20;
	}
	
	@Override
	public int getPrice() {
		return 100000;
	}

	@Override
	public double getProbability() {
		return (getQty() / totalPrizeQty)* 100.0 ;
	}
}