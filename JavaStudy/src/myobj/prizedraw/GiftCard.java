package myobj.prizedraw;

public class GiftCard extends Prize {
	@Override
	public String prizeName() {
		return "기프트카드";
	}
	
	@Override
	public int getQty() {
		return 100;
	}
	
	@Override
	public int getPrice() {
		return 10000;
	}

	@Override
	public double getProbability() {
		return (getQty() / totalPrizeQty) * 100.0 ;
	}
}
