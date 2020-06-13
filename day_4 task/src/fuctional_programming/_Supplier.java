package fuctional_programming;

import java.awt.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getString());
		System.out.println(getStringSupplier.get());
		}
		static String getString() {
		return "We are here to learn";
	}
	//supplier==returns any type of value only can be list , integer 
	static Supplier<String> getStringSupplier = () ->
	"We are here to learn";
	
}
