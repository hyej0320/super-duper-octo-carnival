package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile_T {

	public static void makeEmailFile(String text) {
		Pattern emailPattern = Pattern.compile("\\S*@\\S*");
		Matcher m = emailPattern.matcher(text);
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("myfiles/email.txt");
			while(m.find()) {
				String email = m.group();
				fout.append(email + "\n");
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fout != null) {
					fout.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	// 문자열을 전달해주면 해당 문자열 안에 있는 이메일들만 추출하여 파일로 써주는 메서드 
	public static void main(String[] args) {
		makeEmailFile(D10_ReporterList_T.reporters);
		
		
		
		
		
		}
	}

