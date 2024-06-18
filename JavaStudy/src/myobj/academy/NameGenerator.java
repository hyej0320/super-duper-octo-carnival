package myobj.academy;

public class NameGenerator {
	// 다른 클래스에서 쓸 필요가 없는 자원들을 private으로 숨겨놓는다
	private String[] lastNameCandidates = {"김", "이", "박", "최", "한", "서", "홍", "오", "윤", "강", "정"};
	private String[] firstNameCandidates = {"영식", "영수", "영호", "영철", "광수", "상철", 
											"영숙", "순자", "옥순", "영자", "현숙", "정숙"};
	
	public void setLastNameCandidates(String... lastNames) {
		this.lastNameCandidates = lastNames;
	}
	
	public void setFirstNameCandidates(String... firstNames) {
		this.firstNameCandidates = firstNames;
	}
	
	// 다른 클래스에서 쓸 필요가 없는 기능들을 private 숨겨놓는다 
	private String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}
	
	public String generate() {
		return selectRandomOne(lastNameCandidates) 
				+ selectRandomOne(firstNameCandidates);
	}
}
