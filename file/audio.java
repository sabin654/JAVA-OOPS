package file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	
		
	Scanner sc= new Scanner(System.in);
		
	File a= new File("audio.wav");
	AudioInputStream audioStream= AudioSystem.getAudioInputStream(a);//audio object 
    Clip c= AudioSystem.getClip();//clip object
    c.open(audioStream);
    
    String response = "";
   
    
    while(!response.equals("Q")) {
    	System.out.println("P = play S= stop, R= reset, Q= quit");
    	System.out.println("enter ur choice");
    	
    	    response = sc.next();
    	    response = response.toUpperCase();
    	    
    	    
    	    switch(response) {
    	    case ("P"):  c.start();
    	    break;
    	    case ("S"):  c.stop();
    	    break;
    	    case ("R"):  c.setMicrosecondPosition(0);
    	    break;
    	    case ("Q"):  c.close();
    	    break;
    	    
    	    
    	    default: System.out.println("not valid ");
    	    
    	    
  
    
    }
    }
    
  
    
   

    
		
}
}

