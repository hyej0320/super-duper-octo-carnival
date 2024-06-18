package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import quiz.D10_ReporterList_T;

public class GuGudan {
	
	public static void makeGugudan() {
		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/gugudan.txt");
			
			for (int i = 2; i <= 9; ++i) {
				for (int j = 1; j <= 9; ++j) {
					out.write(i + " * " + j + " = " + i * j + "\t");
					if (j % 9 == 0) {
					out.write("\n");
					}
				}
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

	public static void printGugudan() {
		FileReader in = null;
		try {
			in = new FileReader("myfiles/gugudan.txt");
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		makeGugudan();
		printGugudan();
		
	}
}
