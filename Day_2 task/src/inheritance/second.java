package inheritance;
	
  class second {

	public void check() throws IndexOutOfBoundsException{
		try{
			int a[] = new int[10];
			for(int i = 0;i<a.length;i++) {
				System.out.println("We are here "+a[i]);
				//System.out.println(a[11]);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

	//interfaces--------------==========================---------------
	interface one{
		public void start();
	}
	interface two{
		public void stop();
	}
	
	class interface1 implements one,two{
		public void start()
		{
			System.out.println("System is just strated");
		}
		public void stop() {
			System.out.println("System is just stopped");
		}
		public void restart() {
			System.out.println("System is just restrated");
		}
	}

	//abstract classes=====================
	abstract class company{
		//abstract methos (body is provided by sub class)
		abstract public void regular();
		//regular method
		public void job() {
			System.out.println("I am a regular method in abstract class");
		}
		}
	class campus extends company{

		@Override
		public void regular() {
			System.out.println("I am abstract method extended from another class.");
			
		}
		
		
	}
