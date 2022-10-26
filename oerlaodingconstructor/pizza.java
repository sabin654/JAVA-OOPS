package oerlaodingconstructor;
//Overloading constructor= same  method or constructor but different parameter

public class pizza {
	
	String bread;
	String sauce;
	String cheese;
	
	
	
	pizza(){
		
	}

	
	pizza(String bread){
		this.bread= bread;
		
	}
	
 pizza(String bread, String sauce){
			
			this.bread= bread;
			this.sauce= sauce;
		
		}
	
	pizza(String bread, String sauce, String cheese){
		
		this.bread= bread;
		this.sauce= sauce;
		this.cheese= cheese;
		
		
	}
   
	
	
	public static void main(String[] args) {
		pizza p= new pizza("crust","tomato","chessy");
		
		System.out.println("here are the good pizzza");
		System.out.println(p.bread + p.cheese+ p.sauce);
		
		
		
	}

}


