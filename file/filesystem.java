package file;

import java.io.FileWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.FileSystem;

public class filesystem {
	

	public static void main(String[] args) {
		
		
		
		try {
		
		FileWriter file = new FileWriter("poem.txt" );
		file.write("sabin is a good by and he is so creative");
		file.append("ssss");	
		file.close();
		
		} 
	
		catch(IOException e) {
			
		e.printStackTrace();
}
	}
}

