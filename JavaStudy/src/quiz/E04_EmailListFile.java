package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E04_EmailListFile {

	//D11번 문제에 있는 기자들의 이메일들로만 이루어진 파일을 myfiles 폴더에 생성해보세요
	
	public static void main(String[] args) {
		D10_ReporterList_T list= new D10_ReporterList_T();
		
		Pattern p = Pattern.compile("((\\w*)@(\\w*(\\.\\w+)*))");
		Matcher m = p.matcher(list.reporters);

		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/reporterList.txt");
			
			while(m.find()){
				out.write(m.group() + '\n');
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
