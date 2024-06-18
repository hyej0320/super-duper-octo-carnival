package quiz;

import java.util.Random;

public class B12_TempPassword {

	/*
	 	알파벳 대문자로만 구성된 랜덤 4자리 비밀번호를 20개 생성하여 출력해보세요
	 */
	public static void main(String[] args) {
		Random ran = new Random();



		
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println(' ' + 64);
		System.out.println("----------------------------------------");
		char ch1 = 'A';
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println("----------------------------------------");
		
		int cnt;
		for (int i = 0 ;  i < 20 ; ++i) {
			System.out.print((char)(ran.nextInt(ch2 - ch1 + 1) + ch1));

			} 

	} 
}
