package quiz;


import myobj.omok_t.Omok_T;

public class D07_Omok_T {

	public static void main(String[] args) {
		Omok_T omok = new Omok_T();
		
		
		omok.putBlack(3, 7);
		omok.putBlack(4, 7);
		omok.putBlack(5, 7);
		omok.putBlack(6, 7);
		omok.putBlack(7, 7);
		
		omok.putWhite(2, 1);
		omok.putWhite(2, 2);
		omok.putWhite(2, 3);
		omok.putWhite(2, 4);
		omok.putWhite(2, 5);
		
		omok.putWhite(9, 2);
		omok.putWhite(10, 3);
		omok.putWhite(11, 4);
		omok.putWhite(12, 5);
		omok.putWhite(13, 6);

		
		
		
		System.out.println(omok.postCheck(7, 7, Omok_T.BLACK_STONE)); // static 메서드는 클래스를 가져와 작성
		System.out.println(omok.postCheck(13, 6, Omok_T.WHITE_STONE));
		
		omok.printBoard();
	}
}
