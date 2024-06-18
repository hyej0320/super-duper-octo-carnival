package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_Copy {

	/*
		폴더의 경로를 전달하면 같은 경로의 폴더이름2를 만들고 
		안의 모든 내용을 복사해주는 메서드를 만들어보세요
		ex) dog 폴더의 경로를 전달하면 안에 있는 모든 강아지 사진이 복사된 dog2 폴더가 생겨야 함 
		ex) myimage 폴더의 경로를 전달하면 myimage2를 만들고 안의 모든 내용이 복사되어야 함
	 */
	
	public static void copy(String path) {
		
		String copyFolderName = path + "2";
		File copy = new File(copyFolderName);
		if (!copy.exists()) {
			copy.mkdir();
		}
		String[] fileNames = new File(path).list();
		for (String file : fileNames) {
			File child = new File(new File(path), file); 
			System.out.println(file);
			
			int ch;
			
			FileReader in = null;
			try {
				in = new FileReader(child);
				while ((ch = in.read()) != -1) {
					System.out.print((char)ch);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			FileWriter out = null;
			try {
				out = new FileWriter(copyFolderName + "/" + file);
			
//				out.write((char)ch);

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
	
	public static void main(String[] args) {
		copy("myimage/memo");

	}
}
