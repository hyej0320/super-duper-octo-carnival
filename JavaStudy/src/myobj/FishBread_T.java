package myobj;

public class FishBread_T {

	// 붕어빵을 많이 찍어내더라도 일정해야 하는 값
	final static String[] flavorNames = {"팥", "슈크림", "민트초코"};
	final static int[] defaultPrices = {800, 1000, 1200};
	final static String[] qualityNames = {"상", "중", "하"};
	final static int[] qualityPrices = {100, 0, -100};
			
	public final static int kindOfFlavors = flavorNames.length;
	
	public int flavor;
	public int quality;

	
	public FishBread_T() {
		flavor = (int)(Math.random() * flavorNames.length);
		quality = (int)(Math.random() * qualityNames.length);
	}
	
	public int getPrice() {
		return defaultPrices[flavor] + qualityPrices[quality];
	}
	
	public static int getTotalPrice(FishBread_T[] breads) {
		int sum = 0;
		for (int i = 0; i < breads.length; ++i) {
			sum += breads[i].getPrice();
		}
		return sum;
	}
}
