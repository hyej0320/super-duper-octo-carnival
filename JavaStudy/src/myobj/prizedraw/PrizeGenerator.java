package myobj.prizedraw;

public class PrizeGenerator {

	String name;
	int qty;
	int price;

	public PrizeGenerator (String name, int qty, int price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("경품: %s\n수량: %d\n가격: %d\n",
							name, qty, price);
	}
}
