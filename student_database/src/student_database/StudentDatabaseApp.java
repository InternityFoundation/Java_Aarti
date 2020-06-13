package student_database;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// ask how many new users we want to add
		System.out.println("enter number of users or students to enroll want to add: ");
		Scanner in=new Scanner(System.in);
		int numOfStudents =in.nextInt();
		student[] students=new student[ numOfStudents];
		//create n number if new students
		
		for(int n=0;n<numOfStudents;n++) {
			students[n] = new student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].toString());
			//System.out.println(stu1.showInfo());
			
		}
		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
	}

}
