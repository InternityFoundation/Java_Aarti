package basics;

public class encap{
//here using private means it cannot be used only in current class and in nested class of the same class
	//protected means accessible only in the same package and only in the sub class
			private String name;
			private int rollnumber;
			encap(String name , int rollnumber){
				this.name = name;
				this.rollnumber=rollnumber;
				System.out.println("Name is:"+name );
				System.out.println("Rollnumber is:"+rollnumber );
			}
			
}
