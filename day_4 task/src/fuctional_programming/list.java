package fuctional_programming;

import java.util.function.*;

public class list {

	public static void main(String[] args) {
		// Our common function approach
		int increment = incrementByOne(1);
		System.out.println(increment);
		//Function
		 int increment2 =incrementByOneFunction.apply(1);
		 System.out.println(increment2);
		 int multiply = MultiplyBy10.apply(increment2);
		 System.out.println(multiply);
		 //caining of function
		 Function<Integer , Integer> addBy1AndThen = incrementByOneFunction.andThen(MultiplyBy10);
		 System.out.println(addBy1AndThen.apply(3));
		 //BiFunction ->takes two input produces one output
		 System.out.println(incrementBy(4,100));
		 System.out.println(incrementByFour.apply(4,100));
		 
	}
	
	//functional approach
	 static Function<Integer,Integer> incrementByOneFunction = number -> number +1 ;
	 static Function<Integer,Integer>MultiplyBy10 = number -> number*10;
	 //BiFunction
	  static BiFunction<Integer, Integer, Integer> incrementByFour = (number , number2) -> (number +1) *number2;	
	 //equl to  functional approach
	static int incrementByOne(int number) {
		return number +1;
	}
	//exact same thing as BiFunction
	static int incrementBy(int number,int number2) {
		return (number+1 )*number2;
	}
	
}
