package quiz;

public class B10_Gugudan_T {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan + "단: ");
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		for (int gop = 0; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.print(dan + "단\t");
				} else {
				System.out.printf("%dx%d=%d\t", dan, gop, dan * gop);
				}
			}		
			System.out.println();
		}
	}
}
