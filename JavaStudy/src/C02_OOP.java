
public class C02_OOP {

	/*
		# 객체 지향 프로그래밍 (Object Oriented Programming)
		
		- 변수와 함수들을 무분별하게 사용하다 보니 정신없어서 생겨난 방식
		- 변수와 함수들을 세상에 실제로 존재하는 개념(객체)으로 묶어서 생각하면	
		  프로그램의 유지보수 및 가독성 측면에서 도움이 된다
		- 객체 내부의 변수는 현재 상태를 나타내고 
		  객체 내부의 함수(메서드)는 해당 객체의 기능 및 동작을 나타낸다
		  
		  ex: 책
		  
		  - 책의 현재 상태를 변수로 표현한 것 : 
		  	현재 펼쳐진 페이지, 책의 최대 페이지, 책의 커버 재질, 작가 이름, 작가의 영어 이름, 책의 가격, ...
		  
		  - 책의 기능 및 동작을 메서드로 표현한 것 :
		  	다음 페이지로 넘기기(현재 페이지 + 1), 원하는 페이지 펼치기, 첫 페이지로 가기, 
		  	책의 원하는 페이지를 찢기, ... 등
		  	
		# 클래스 (Class)
		 
		- 객체 지향 프로그래밍에서 의미하는 객체를 프로그래밍 언어로 표현하는 문법
		- 클래스는 정의한 시점에는 실체가 없는 객체의 설계도이다
		- 클래스를 통해 만들어내는 실체를 ★인스턴스(instance)라고 부른다
	 */
	public static void main(String[] args) {
		
		// Book이라는 설계도를 통해 실체(인스턴스)를 찍어내야 사용할 수 있다
		// new를 통해 인스턴스를 찍어낼 때마다 메모리 상에 필요한 만큼의 공간을 확보한다
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.currentPage = 130;
		b2.currentPage = 13;
		b3.currentPage = 0;
		
		b1.totalPage = 200;
		b2.totalPage = 80;
		b3.totalPage = 1000;
		
		for (int i = 0; i < 1000; ++i) {
			b1.nextPage();
		}
		
		// 찍어낸 실체마다 변수의 현재 상태가 다르다
		System.out.println("책1의 현재 페이지: " + b1.currentPage);
		System.out.println("책2의 현재 페이지: " + b2.currentPage);
		System.out.println("책3의 현재 페이지: " + b3.currentPage);
		
		System.out.println("------------------------------------------");
		
		SubwayLine line5 = new SubwayLine();
		SubwayLine line6 = new SubwayLine();
		SubwayLine line7 = new SubwayLine();
				
		line5.firstStation = 510;
		line6.firstStation = 610;
		line7.firstStation = 709;
		
		line5.lastStation = 553;
		line6.lastStation = 648;		
		line7.lastStation = 761;
		
		System.out.println("현재 역 번호: " + line5.currStation);
		
		System.out.println("---------------------------------------------");
		
		Cafe c1 = new Cafe();
		Cafe c2 = new Cafe();
		
		c1.changeName("빽다방");
		c2.changeName("얼음값 500원 카페");
		
		c1.addMenu("아메리카노", 10, 2000);
		c1.addMenu("빽사이즈 아메리카노", 20, 3000);
		
		c2.addMenu("아메리카노", 10, 1800);
		
		
		c1.printCafeInfo();
		c2.printCafeInfo();
	}
}

// 생각한 객체를 프로그래밍 언어로 표현한 것을 클래스라고 한다
class Book {
	int currentPage;
	int totalPage;
	int typeOfCover;
	String authorName;
	String authorEngName;
	
	// this : 나중에 생성될 인스턴스 자기 자신을 의미하는 키워드
	void nextPage() {
		if (this.currentPage < this.totalPage) {
			++this.currentPage;
		}
	}
}

	
/*
	실제로 존재하는 객체를 하나 참조하여 클래스를 생성한 후 테스트 해보세요 (책 금지)
*/
class SubwayLine {
	int qtyOfStation;
	int stationNum;
	int currStation;
	int nextStation;
	int firstStation;
	int lastStation;
	String[] stationName = new String[qtyOfStation];
	
	void nextStation() {
		if (currStation < qtyOfStation) {
			++currStation;
		}
	}
}
	
// 예시
class Cafe {
	// 나중에 인스턴스 생성 시의 기본값을 설정해 놓을 수 있다
	String name = "기본카페이름";
	int area = 10;
	int seat = 20;
	int table = 5;
	CafeMenu[] menu = new CafeMenu[5];
	int menuCount = 0;
	
	
	// 매개 변수명과 인스턴스 변수명이 같은 경우 this를 활용해 구분해 줄 수 있다
	void changeName(String name) {
		this.name = name;
	}
	
	void printCafeInfo() {
		System.out.printf("카페 이름: %s\n", this.name);
		System.out.printf("카페 면적: %d평\n", this.area);
		System.out.printf("카페 좌석 수: %d석\n", this.seat);
		System.out.printf("테이블 수: %d개\n", this.table);		
		
		System.out.println("###### 메뉴판 ######");
		for (int i = 0; i < menu.length; ++i) {
			if (menu[i] != null) {
			System.out.printf(" - %s : %d원(%dkcal)\n", 
					menu[i].name, menu[i].price, menu[i].calories);
			} else {
				System.out.println("menu[i]");
			}
		}
	}
	
	void addMenu(String name, int calories, int price) {
		CafeMenu toAdd = new CafeMenu();
		
		toAdd.name = name;
		toAdd.calories = calories;
		toAdd.price = price;
		
		this.menu[this.menuCount++] = toAdd;
	}
}

class CafeMenu {
	String name;
	int calories;
	int price;
	
}