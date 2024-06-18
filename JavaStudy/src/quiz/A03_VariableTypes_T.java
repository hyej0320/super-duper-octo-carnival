package quiz;

public class A03_VariableTypes_T {
	
	public static void main(String[] args) {
		
		//풀이
		String name = "홍길동";
		int ag = 20; //자원을 아주 절약해야하는 상황이 아니라면 그냥 int쓰는 편
		String tel = "010-1234-1234";
		double height = 178.5; // 자원을 아주 절약해야하는 상황이 아니라면 그냥 double쓰는 편
		double kg = 75;
		String B1 = "O"; // AB형은 char타입에 저장할 수 없으므로 String을 써야한다
		
		
		System.out.println("===========출력 결과===========\n");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + ag);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + kg);
		System.out.println("혈액형\t: " + B1);
		
	}
}
