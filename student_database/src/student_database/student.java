package student_database;

import java.util.Scanner;

public class student {
	private String fn;
	private String ln;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int  tutionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	//constructor prompts to enter students name and year
	public  student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student's first name:");
		this.fn=in.nextLine();
		System.out.println("Enter student's last name:");
		this.ln=in.nextLine();
		System.out.println("1 - freshers \n 2 - junior \n 3 - software dev \n 4 - senior \n Enter student's class level:");
		this.gradeYear=in.nextInt();
						
		setstudentID();
		//System.out.println(fn + " " +ln +" "+gradeYear+" "+studentID);
		}
	
	
	//generate ID
	private void setstudentID() {
		//grade level +id
		id++;
		this.studentID= gradeYear+""+id;
	}
		//enroll in course
	
	public void enroll() {
		//get inside a loop user hits 0
		do {
		System.out.println("enter course to enroll(Q to quit)");
		Scanner in=new Scanner(System.in);
		String course= in.nextLine();
		if(!course.equals("Q")) {
			courses =courses +"\n" +course ;
			tutionBalance=tutionBalance+costOfCourse;
		}
		else{
			
			break;
			}
		}
		while(1 !=0);
		
		System.out.println("ENROLLED IN:"+courses);
		System.out.println("Tution Balance is :"+tutionBalance);
	}
		
		//view balance and 
		public void viewBalance() {
			System.out.println("Balance is:"+tutionBalance);
		}
		//pay tution
		public void payTution() {
			viewBalance();
			System.out.println("enter your pament:$");
			Scanner in=new Scanner(System.in);
			int payment = in.nextInt();
			tutionBalance=tutionBalance-payment;
			System.out.println("thank you for the payment:"+payment);
			viewBalance();
		}
		//show status
		public String toString() {
			return "\n\n details:\nname:"+fn +" "+ln+
					"\n Grade level:"+gradeYear+
					"\nStudentID:"+studentID+
					" \n courses enrolled:"+courses+
					"\nbalance:$"+tutionBalance;
		}
}
	
	
