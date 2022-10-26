package polumorphism;

public class main {

	public static void main(String[] args) {
	//polymorphism = greek word for poly- many and morph - form
		// thr ability of an object to indentify  as more  than one type
		
		
		
		car c= new car();
		boat b= new boat();
		bike b1= new bike();
		
		vechile[] v= {c,b,b1};
		 
		for(vechile x: v) {
			x.go();
			
			// x means sabai vechile ma gayera basxa car, boat, bike  sabai vechile ,a gayera basxa 
			
		}	
		
		labra labra = new labra();
		bull bull= new bull();
		
		animal[] animal= {labra, bull};
		
		for(animal x: animal) {
			
			x.run();
		}
		
		
		
		
		
		
		
		
		
		
		}
		
		

	}


