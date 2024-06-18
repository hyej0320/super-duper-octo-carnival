package myobj;

public class FishBread {
	String taste;
	int price;
	char quality;
	
	static int price_redbean = 800;
	static int price_shou = 1000;
	static int price_mint = 1200;
	
	public FishBread(String taste, char quality) {
		this.quality = quality;
		this.taste = taste;
		
	}
	
	
	
	
	void changePrice() {
		if (quality == '상') {
			price_redbean += 100;
			price_shou += 100;
			price_mint += 100;
		} else if (quality == '하') {
			price_redbean -= 100;
			price_shou -= 100;
			price_mint -= 100;
		}

	}
	// 이 생성자를 통해 만들어지는 인스턴스들은 가격은 받은 걸로 채우고 무게는 10으로 설정하겠다

		
	
		
	
	
	
}


