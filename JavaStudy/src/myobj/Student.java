package myobj;

import java.util.Arrays;
import java.util.Random;

public class Student {
	String name;
	int studentId;
	String className;
	int subjectQty;
	String[] subject = new String[subjectQty];
	int kor;
	int math;
	int eng;
	double subNum;
	
	Random ran = new Random();
	
	public Student() {
		
	}
	
	public void getId() {
		int[] id = new int[100];
		
		for (int i = 0; i < id.length; ++i) {
			id[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < 1000; ++i) {			
			int ranIndex = (int)(Math.random() * (id.length - 1)) + 1; 
			int temp = id[0];
			id [0] = id[ranIndex];
			id[ranIndex] = temp;
		}
		System.out.println(Arrays.toString(id));
	}


	public void getName() {
		String[] lastName = {"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한"};
		String[] firstName = {"혜진", "지예", "예진", "소영", "정윤", "수현", "수민", "지민", "수빈"};
		String[] name = new String[100];
		
		
		
		for (int i=0; i < 100; i++) {
		    name[i] = lastName[ran.nextInt(lastName.length)] 
		    		+ firstName[ran.nextInt(firstName.length)];
		}
		
		System.out.println(Arrays.toString(name));
	}
	
	public int subjectQty(int num) {
		return num;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public int sum() {
		return kor + math + eng;
	}
	
	public double avg() {
		return sum() / subNum ;
	}
	
	
}

class ProStudent extends Student {
	int subjectQty = 6;
	int lanC;
	int os;
	int data;
	String[] subject = {"lanC", "os", "data"};
}

class NetStudent extends Student {
	int subjectQty = 5;
	int linux;
	int network;
	int ccna;
	
}

class MachineStudent extends Student {
	int subjectQty = 6;
	int stat;
	int python;
	int sql;
}
