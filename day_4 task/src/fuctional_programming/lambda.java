package fuctional_programming;
import java.util.*;

public class lambda {
			
	public static void main(String[] args) {
		//basic lambda expressions
		 sum greet = ()-> System.out.println("This is is an inline lambda expression");
		 //parameterixed lambda
		 addFun add = (int a ,int b) -> System.out.println("Addition is:"+(a+b));
		  greet.sum1();
		 add.second(5, 6);
		 }
	//interfaces to run a lambda expression 
		public interface sum {
		public void sum1();
		}
		interface addFun {
		void second(int a , int b);
	}
	
}




