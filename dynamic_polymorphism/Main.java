package dynamic_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 Animal animal;
		 System.out.println("What animal do u like ");
		 System.out.println("1= cat and 2= dog");
		 
		 int choice = sc.nextInt();
		 
		 
		 if (choice==1) {
			 animal = new cat();
			 animal.speak();
			 
			 
			 
		 }
		 
		 else if (choice==2) {
			 animal = new dog();
			 animal.speak();
			 
			 
			 
		 }
		 else{
			 animal = new Animal();
			 System.out.println("invalid");
			 
			 
		 }
		 
		 
	}

}
