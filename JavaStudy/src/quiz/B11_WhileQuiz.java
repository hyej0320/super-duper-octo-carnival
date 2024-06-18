package quiz;

public class B11_WhileQuiz {

	/*
	 	while문을 사용하여
	 	
		1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
		
		2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해보세요 
		
		3. 1부터 1000까지 모든 10의 배수를 한 줄에 8개씩 출력해보세요

		4. 1부터 19까지의 모든 숫자의 곱을 구해서 출력해보세요
		
		5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 */
	public static void main(String[] args) {
		

		
		int i;
		i = 1000;
		while(i++ <= 2000) {
			if (i % 13 == 0)
					System.out.println(i);
			
				}

		System.out.println("---------------");
		
		int total = 0;
		i = 50;
		while(i <= 100) {
			total += i++;
		}
		System.out.printf("%d\n", total);
		
		System.out.println("---------------");
		
		i = 0;
		int cnt = 0;
		while(i++ <= 1000) {
			if (i % 10 == 0) {
				System.out.print(i);
			}	
				if (++cnt % 8 == 0) {
					System.out.println();
				}
		}
			
	}
}