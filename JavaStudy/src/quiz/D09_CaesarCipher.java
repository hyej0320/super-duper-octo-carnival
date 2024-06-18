package quiz;

public class D09_CaesarCipher {

	/*
		# 시저(카이사르) 암호
		
		- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는
		  암호 알고리즘
		  
		  [암호표]
		  
		  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+
		  abcdefghijklmnopqrstuvwxyz {}[]|\;:'"/?
		  
		  * 암호화
			  (평문)     key:3     (암호문)
			  HELLO!  -------->	  KHOOR!
		 
		  * 복호화
			       	    key:3     	
			  HELLO!  <--------	  KHOOR!
		 

		1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
		
		2. 암호문과 키 값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
		
		※ 암호화 할 수 있는 문자의 종류: 영어 대/소문자, 숫자, 특수문자 
		  
	 */
	
	
	
	public static String encryption(String text, int key) {

		String pwList = 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
				+ "abcdefghijklmnopqrstuvwxyz {}[]|.,<>;:'\"/?";
		
		StringBuilder sb = new StringBuilder(text);
		// sb2.setCharAt(sb2.indexOf("o"), 'O');
		// sb2.setCharAt(0, 'G');

		String password = "";
		
//		for (int i = 0; i < text.length(); ++i) {
//			System.out.printf("%d번째 문자의 위치: %d\n", i, pwList.indexOf(text.charAt(i)));
//		}
//		
		for (int i = 0; i < text.length(); ++i) {
			System.out.printf("%d(+%d)번째 문자:(%s) \n",
					i, key, pwList.charAt(pwList.indexOf(text.charAt(i)) + key));
		}
		
		for (int i = 0; i < text.length(); ++i) {
			for (int j = 0; j < pwList.length(); ++j) {
				int changeNum = text.charAt(i) + key;
				sb.setCharAt(i, pwList.charAt(pwList.indexOf(changeNum)));
			}
		}
		System.out.println(sb);
		
		
//		for(int i = 0; i < text.length(); ++i) {
//			for (int j = 0; j < pwList.length(); ++j) {
//				char ch = pwList.charAt(j);
//				if (text.charAt(i) == ch) {
//					System.out.printf("(%s)의 위치: %d\n" , text.charAt(i), pwList.indexOf(ch));
//
//				}
//			}
//		}
		return password;
	}
	
	public static String decryption(String password) {
		return "";
	}
	
	public static void main(String[] args) {
		String password = "Hello. My name is Hyejin";
		encryption(password, 3);
	}
}
