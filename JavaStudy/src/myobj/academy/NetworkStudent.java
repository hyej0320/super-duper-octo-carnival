package myobj.academy;

// 네트워크 반 학생들은
// 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
public class NetworkStudent extends AcademyStudent {
	String className;
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		super(); // 알아서 호출하기 때문에 생략 가능
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
		
	}
	@Override
	public String getClassName() {
		return "네트워크";
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0 ;
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\nd영어: %d\n리눅스: %d\n"
				+ "네트워크: %d\nCCNA: %d\n", kor, eng, linux, network, ccna);
	}
}
