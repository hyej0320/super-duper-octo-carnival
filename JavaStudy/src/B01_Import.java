
// 내가 이 소스코드에서 A03_VariableTypes라는 걸 쓸 건데 quiz패키지에 있음
import quiz.A03_VariableTypes;

// 내가 이 소스코드에서 Scanner라는 걸 갖다 쓸 건데 java.util 패키지에 있다
import java.util.Scanner;
public class B01_Import {

	/*
	 	# import
	 	
	 	- 다른 패키지에 속한 다른 클래스를 불러 사용하기 위해서 필요한 문법
	 	
	 */
		public static void main(String[] args) {

		// 우리는 사실 만들었던 다른 클래스를 불러 사용할 수 있다
		A06_Print.main(null); //null은 값을 전달하기 귀찮다?
		B00_Scanner.main(null);
		
		// 다른 패키지에 속한 클래스를 부를 때는 패키지명까지 적어야 한다
		quiz.A02_SwapValue.main(null);
		
		// 패키지명을 일일이 쓰기 귀찮을 때 -> import 작성: 내가 이 소스코드에서 A03_VariableTypes라는 걸 쓸 건데 quiz패키지에 있음
		A03_VariableTypes.main(null);
	}
	
}	
