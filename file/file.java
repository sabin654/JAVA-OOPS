package file;

import java.io.File;

public class file {

	public static void main(String[] args) {
	
		
		
		File file= new File("s.txt");
		
		if(file.exists()) {
			System.out.println("file exist");
			System.out.println(file.getPath()); 
			System.out.println(file.getAbsolutePath());// path show garxa sabai
			System.out.println(file.isFile()); //file xa ki nai herxa ki true ki false bhanxa
		file.delete(); //delete the file
		
			
		}
		else {
			System.out.println("file does not exist");
			
		}
		
	}

}
