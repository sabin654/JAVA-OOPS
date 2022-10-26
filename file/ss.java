package file;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

public class ss {
	public static void main(String[] args) {
		
	
			
		  try {
			FileReader file = new FileReader("output.txt.txt");
			int data= file.read();
			
			while(data!= -1) {
				System.out.print((char)data);
				data = file.read();
			} 
		file.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				  
		}

}


	


