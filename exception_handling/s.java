package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class s {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	try {	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number ");
		int x= sc.nextInt();
		
		System.out.println("enter the second number ");
		int y= sc.nextInt();
		
		int z= x/y;

		System.out.println("result" + z);
	}
	
	 // try and catch le chai error exception bahnera dekaudaiana hamile j input diyo tai dekahuxa
	// for exam= if we enter value x=5 and y=0 thn, exception error provide garxa or y = pizaa input diyeni error garxa
	//but if we use catch  bhitra System.out.println("0 cant be divide"); than yesle hamile diyeko input provide garxa
	
	 
	catch(ArithmeticException e) { // for int
		System.out.println("0 cant be divide");
	}
	catch(InputMismatchException e) { //for string
		System.out.println("word cant be written in int");
	}
	catch(Exception e) { // for all 
		
	}
	
	finally {
		System.out.println("print it ");
		
	}
	

}}
