package fuctional_programming;

import java.util.function.Consumer;


public class _consumer {
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void getName(String name) {
			this.name = name;
		}
		public static void main(String [] args) {
			_consumer cons = new _consumer();
			Consumer<_consumer> Name = p-> p.setName("Shivanya");
			Name.accept(cons);
			System.out.println(cons.getName());
		}
	}


