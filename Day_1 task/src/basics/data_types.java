package basics;

import java.util.Scanner;

//datatypes
			public class data_types {
				int a = 25 ; int b =26;
					int balance = 5000;
					 String name = "Aarti"; 
					 int bank = 1234;
					 int pin = 0000;
					/*
					 * int mydouble = 25; double myvar = (int) mydouble; Boolean b1 = (a>b)&&(a==b);
					 *public void var(){
					 * System.out.println("Casted value of double varible is :"+myvar);
					 * System.out.println("Is a grater than b:"+b1); }
					 */
				public void conditions() {
					int j[]=new int[10];
					for( int i=0; i<=j.length;i++) {
					System.out.println("Enter your choice to perform operations:");
					System.out.println("1. Deposit");
					System.out.println("2. Withdraw");
					System.out.println("3. Check balance");
					System.out.println("4. Change settings");
					System.out.println("5. Exit");
					Scanner sc = new Scanner(System.in);
					int n1 = sc.nextInt();
					switch(n1) {
					case 1: if(n1==1) {
						System.out.println("Hey !"+name +" How much amount do you want to Deposit:");
						Scanner s = new Scanner(System.in);
						int y = s.nextInt();
						balance = balance + y;
						System.out.println("Amount Deposited Successfully ! Thank you..");
						}  
					else 
						System.out.println("Wrong choice to deposit amount");
					break;
					
					case 2: 
						System.out.println("Hey !"+name +" How much amount do you want to withdraw:");
						Scanner st = new Scanner(System.in);
						int z = st.nextInt();
						if (z <= balance) {
							balance = balance - z;
							System.out.println("Updated Amout is :"+balance);
						}
						else
							System.out.println("Sorry Aarti! you have no sufficient amount to withdraw");
						
					break;
					
					case 3: System.out.println("Your updated amount is:"+balance);
					break;
					case 4:
						System.out.println("Your settings are here--");
						System.out.println("Please tell us what you want to change:\n 1. Name\n 2. Your Pin\n 3.your bank Account Number \n4.Go to home");
						Scanner r=new Scanner (System.in);
						int e = r.nextInt();
						if(e==1) {
							System.out.println("Here is your old name:="+name+"\n Please enter your updated name");
							Scanner name = new Scanner(System.in);
							String na= name.next();
							 System.out.println("Your Updated name is:"+na);
							
						}
						else if(e==2) {
							System.out.println("\n Please enter your old pin");
							Scanner p = new Scanner(System.in);
							int pn= p.nextInt();
							if(pin==pn) {
								System.out.println("\n Please enter your new pin");
								Scanner pt = new Scanner(System.in);
								int py= pt.nextInt();
								pin =py;
							 System.out.println("Your Updated pin is:"+py);
							
						}
							else {
								System.out.println("you enterred wrong pin");
							}
						}
						
						else if(e==3) {
							System.out.println("\n Your old bank account number is:"+bank);
							System.out.println("\n Please enter your new bank account number:");
							Scanner bn = new Scanner(System.in);
							int by= bn.nextInt();
							if(bank==by) {
								bank = by;
							 System.out.println("Your Updated pin is:"+by);
							
						}
						
						else {
							System.out.println("You exit !");
							}}
					 }}}}
