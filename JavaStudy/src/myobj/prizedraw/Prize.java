package myobj.prizedraw;


public class Prize {
	
	int totalPrizeQty;

	public Prize() {
		totalPrizeQty = 287;
	}	
	public String prizeName() {
		return null;
	}
	
	public int getQty() {
		return -1;
	}
	
	public int getPrice() {
		return -1000;
	}
	
	public double getProbability() {
		return -1.0;
	}
	
	
	public static void printPrizeList(Prize pri) {

		System.out.println("------------------------");
		System.out.println("경품이름: " + pri.prizeName());
		System.out.println("수량: " + pri.getQty());
		System.out.println("가치: " + pri.getPrice());
		System.out.println("당첨확률: " + pri.getProbability());
		System.out.println("------------------------");
	}
}



	




