package myobj.academy;

public class StuNumGenerator {

	String academyName;	
	int generateCount = 0;
	
	public StuNumGenerator(String academyName) {
		this.academyName = academyName;
	}
	
	public String generate() {
		return String.format("%s%06d", academyName, generateCount++); 
	}
}
