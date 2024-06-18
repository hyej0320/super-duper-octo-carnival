package quiz;

import myobj.academy.AcademyStudent;
import myobj.academy.MlStudent;
import myobj.academy.NetworkStudent;
import myobj.academy.ProgrammingStudent2;

public class C09_Academy_T {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; ++i) {
			AcademyStudent stu; 
			
			switch ((int)(Math.random() * 3)) {
				case 0:
					stu = new ProgrammingStudent2();
					break;
				case 1:
					stu = new NetworkStudent();
					break;
				default:
					stu = new MlStudent();
					break;
			}
			
			AcademyStudent.printDetail(stu);
		}
	}
}
