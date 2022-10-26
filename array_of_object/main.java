package array_of_object;

public class main {

	public static void main(String[] args) {
		
//		int[] num= new int[3];
//		String[] name= new String[4];
//		char[] chars= new char[3];
		
		
		food food1= new food("pizza");
		food food2= new food("hamburger");
		food food3 =new food("rool");
	
		//like this 
		food[]refregerator= new food[3];//food bahnen object ma 3 ta food array jun refregerator ma xa 
		refregerator[0] = food1;
		refregerator[1] = food2;
		refregerator[2] = food3;
		
		//or 
		
		//we can write array like 
		
		//food[]refregerator = {food1,food2,food3};
		
		System.out.println(refregerator[1].name + refregerator[0].name +refregerator[2]  );
		}

}
