package quiz;

import java.util.Random;

public class B12_TempPassword2 {
	
	/*
	 	대문자, 소문자, 특수문자, 숫자로 구성된 
	 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
	 	
	 	※ 비밀번호로 사용 가능한 특수문자의 아스키코드 범위는 33 ~ 47
	 */
	public static void main(String[] args) {
		
		Random ran = new Random();
	
		
		for (int i = 0; i < 20; ++i) {
			String password = "";
			for (int keyLen = 0; keyLen < 6; ++keyLen) {
				char key = 0;
				password += (char)(Math.random() * 90 + 33); 
				if (key >= '0' || key <='9') {
					break;
				}
			}
			
			System.out.println(i + "번째: " + password);
		}
		
		}
	}

