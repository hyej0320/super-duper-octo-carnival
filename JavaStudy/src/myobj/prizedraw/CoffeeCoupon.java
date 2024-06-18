package myobj.prizedraw;

public class CoffeeCoupon extends Prize {
	@Override
	public String prizeName() {
		return "커피교환권";
	}
	
	@Override
	public int getQty() {
		return 150;
	}
	
	@Override
	public int getPrice() {
		return 5000;
	}

	@Override
	public double getProbability() {
		return (getQty() / totalPrizeQty) * 100.0 ;
	}
}