package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption{
	String cryptSet;
	/*
		frankenstein.txt를 시저 암호방식으로 암호화한 
		새 파일 frankenstein_encrypted.enc 를 생성해보세요
		
		(1) char 단위로 한 글자씩 암호화하는 속도를 측정해보기
		
		(2) char[] 방식으로 암호화하는 속도를 측정해보기
		
		(3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
		
		(4) 이미 같은 이름의 암호화 파일이 존재한다면 파일의 이름 뒤에 
			(숫자)를 붙여 다음 파일이 생기게 만들기
			
			frankenstein_encrypted(1).enc
			frankenstein_encrypted(2).enc
			frankenstein_encrypted(3).enc ...

	 */
	
//	public E09_FileEncryption() {
//		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
//				+ "abcdefghijklmnopqrstuvwxyz {}[]|.,<>;:'\"/?";
//	}
//	
//	public E09_FileEncryption(String cryptSet) {
//		this.cryptSet = cryptSet;
//	}
//	
//	// 파일 읽기
//	
//	
//	
//	String encrypt(String text) {
//		StringBuilder encryptText = new StringBuilder();
//		
//		int len = text.length();
//		int key = 5;
//		for (int i = 0; i < len; ++i) {
//			char ch = text.charAt(i);
//			
//			int index = cryptSet.indexOf(ch);
//			
//			if (index != -1) {
//				encryptText.append(cryptSet.charAt(index + key) % cryptSet.length());
//			} else {
//				encryptText.append(ch);
//			}
//		}
//		return encryptText.toString();
//	}
	public static void main(String[] args) {
		
		File textFile = new File("myfiles/frankenstein.txt");
	
		long start, end;
		
		try (
				FileReader in = new FileReader(textFile);
				FileWriter out = new FileWriter(textFile);
		) {
			int ch;
			
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
