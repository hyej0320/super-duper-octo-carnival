package myobj.academy;

// 프로그래밍 반 학생들은
// 국어, 영어, 수학, C언어, 운영체제, 자료구조 점수가 있다
public class ProgrammingStudent2 extends AcademyStudent {
	int kor;
	int eng;
	int math;
	int c;
	int op;
	int ds;
	
	public ProgrammingStudent2() {
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		c = generateRandomScore();
		op = generateRandomScore();
		ds = generateRandomScore();
	}
	
	@Override
	public String getClassName() {
		return "프로그래밍";
	}
	
	@Override
	public int getTotal() {
		return kor + eng + math + c + op + ds;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 6.0;
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n수학: %d\nC언어: %d\n운영체제: %d\n자료구조: %d\n",
						kor, eng, math, c, op, ds);
	}
	
}
