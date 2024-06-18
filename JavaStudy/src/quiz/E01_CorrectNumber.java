package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class E01_CorrectNumber {

	/*
		예외처리 방식을 사용하여 다음을 구현하세요
		
		1. 사용자가 중복없는 4개의 숫자를 한 글자씩 입력해야 한다
		
		2. 사용자가 입력한 숫자가 0 ~ 9 사이의 숫자가 아닌경우 예외가 발생해야 한다
		
		3. 사용자가 입력한 숫자가 이미 입력했던 숫자인 경우 예외가 발생해야 한다
		
		4. 숫자 4개를 모두 입력하고 나면 입력했던 숫자를 다시 한 번 하나씩 입력하여 확인해야 한다
		
		5. 사용자가 입력했던 숫자와 이번에 입력한 숫자가 다르다면 예외가 발생해야 한다
		 
	 */
	
	public static void InputNums() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[4];
		while(true) {
			
			int i = 0;
			while (i < num.length) {
				System.out.printf("%s번째 숫자 입력 > " , i + 1);
				num[i] = sc.nextInt();
				
				if (num[i] < 0 || num[i] > 9) { 
					throw new IsNotNumberException();
				}
				
				for (int j = 0 ; j < i; ++j) {
					if (num[i] == num[j]) {
						throw new DuplicateException();
					}
					
				}
				++i;
			}
			System.out.print("숫자 확인 > ");
			int[] checkNum = new int[4];
			int j = 0;
			while(j < i) {
				checkNum[i] = sc.nextInt();
				if(checkNum[i] != num[i]) {
					System.out.println("숫자가 일치하지 않습니다!!");
					continue;
				} else {
					System.out.printf("%s번째 숫자 일치!!!!", i + 1);
				}
			}
		}
			
		}
		
	
	public static void main(String[] args) {
		while(true) {
			try {
				InputNums();
			} catch (IsNotNumberException e) {
				System.out.println(e);
				continue;
			} catch (DuplicateException e) {
				System.out.println(new DuplicateException());
				continue;
			}
			
		}
	}
}

class DuplicateException extends RuntimeException {
	public DuplicateException() {
		super("앞에 입력한 숫자와 중복된 숫자를 입력하였습니다!");
	}
}

class IsNotNumberException extends RuntimeException {
	public IsNotNumberException() {
		super("0 ~ 9 사이의 숫자가 아닙니다!");
	}
}



