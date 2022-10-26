package encapslation;

class main {

	public static void main(String[] args) {
		
	//encapslation- attribute of a class will be hidden or private
		//can access only through getter and setter
		
		car c= new car("mercedez","maybeach",2000);
		c.setModel("slc");
		
		
		System.out.println(c.getName());
		System.out.println(c.getYear());
		System.out.println(c.getModel());
	
		
		

	}

}
