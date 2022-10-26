package exception_handling;

import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the first number ");
		int x= sc.nextInt();
		
		System.out.println("enter the second number ");
		int y= sc.nextInt();
		
		int z= x/y;
		
		System.out.println("result" + z);
		
		
	}
Scanner sc= new Scanner(System.in);
System.out.println("enter the first number ");
int x= sc.nextInt();

System.out.println("enter the second number ");
int y= sc.nextInt();

int z= x/y;

System.out.println("result" + z);
}