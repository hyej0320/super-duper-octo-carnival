package test;

public class MemberTest {

	public static void main(String[] args) {
		
		Member member = new Member("홍길동", "user01", 100);
		System.out.println(member);
	}
}

class Member {
	String userId;
	String name;
	int age;

	public Member() {
	}
	
	public Member(String name, String userId, int age) {
		this.name = name;
		this.userId = userId;
		this.age = age;
	}
	
	
	public String getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("이름:%s/아이디:%s/나이:%d", name, userId, age);
	}

	
}
