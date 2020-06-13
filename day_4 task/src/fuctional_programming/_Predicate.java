package fuctional_programming;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("090000086500000"));
		//with predicate
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
		System.out.println(isPhoneNumberValidPredicate.and(contains3).test("07000340000"));
		System.out.println(isPhoneNumberValidPredicate.or(contains3).test("07000040000"));
	}
	
	static boolean isPhoneNumberValid(String phonenumber) {
		return phonenumber.startsWith("07") && phonenumber.length() ==11;
	}
	static Predicate<String> isPhoneNumberValidPredicate = phonenumber ->
	phonenumber.startsWith("07") && phonenumber.length() ==11;
	static Predicate<String> contains3 = phonenumber ->
	phonenumber.contains("3");

}
