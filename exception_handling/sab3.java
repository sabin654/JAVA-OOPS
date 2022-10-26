package exception_handling;

public class sab3 {

	public static void main(String[] args) {
		
		 try{
         	int arr[]= {1,2,3,4};
         	/* I'm trying to display the value of
         	 * an element which doesn't exist. The
         	 * code should throw an exception
         	 */
         	System.out.println(arr[10]);
		 }
         	
//catch(ArithmeticException e){
//	
//	System.out.print("Arithmetic Exception");
//}
	
		 catch(ArrayIndexOutOfBoundsException e){
				
				System.out.print("Arithmetic Exception");
			}
				
		 
		 }
		 }
