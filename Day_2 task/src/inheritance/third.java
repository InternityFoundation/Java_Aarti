package inheritance;

class third extends second{
		
	public void sum() {
		int a=5;
		 int b=8;
		int c= a+b;
		System.out.println("Addition is :"+c);
	}
	public void sub() {
		int d= 65;
		int f=43;
		int r= d-f;
		System.out.println("Subtraction is:"+r);
	}
	public void share(String company, String profile) {
		company = company;
		profile = profile;
		System.out.println("Company is:"+company+ "\nProfile is:"+profile);
		
	}
	/*
	 * public void check() { // polymorphism
	 * System.out.println("Function override");
	 * 
	 * }
	 */
}
