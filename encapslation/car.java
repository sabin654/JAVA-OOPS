package encapslation;

public class car {
	
	private String name;
	private String model;
	private int year;
	
	car(String name,String model,int year){
		this.name = name;
		this.model=model;
		this.year=year;
		
	}
	
	//all the variable are private so to make them access in main class we have to go through get and set 
	// get to retrive the data 
	//set is to modify the data 
	
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
		
	}
	public int getYear() {
		return year;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	

}
