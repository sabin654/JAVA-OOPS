package objects;

public class main {

	public static void main(String[] args) {
		
		//object = an instance of a class that may contain attribute and method
		
		car c= new car();
		System.out.println(c.model);
		System.out.println(c.year);
		System.out.println(c.color);
		//this all are calling attribute
		
		
		c.drive();
		c.brake();
		// this are calling method 
		
		
		
		
	}

}


