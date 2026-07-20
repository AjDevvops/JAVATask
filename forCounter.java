
public class forCounter{
public static void main (String [] args){
	int number = 10;
	triangleOne(number);
	System.out.println();
	triangleTwo(number);
	System.out.println();
	triangleThree(number);
	System.out.println();
	triangleFour(number);

}

public static void triangleOne(int number){
	
	for(int counter = 0; counter <= number; counter++){
		for(int count = 0; count <= counter; count++){

			System.out.print("*");
		}
		System.out.println("");
	}
}


public static void triangleTwo(int number){
	
	for(int counter = number; counter >= 0; counter--){
		for(int count = 0; count <= counter; count++){
       
			System.out.print("*");
		}
		System.out.println("");
	}
}


public static void triangleThree(int number){

	
	for(int counter = 0; counter <= number; counter++){


		for(int count = 0; count <= counter; count++){

			System.out.print(" ");
		}
	

		//for(int count = number; count >= counter; count--){

			//System.out.print(" ");
		//}


		for(int count = number; count >= counter; count--){

			System.out.print("*");
		}
		System.out.println("");
	}
}

public static void triangleFour(int number){

	
	for(int counter = 0; counter <= number; counter++){


		for(int count = 0; count <= counter; count++){

			System.out.print(" ");
		}
	
		for(int count = number; count >= counter; count--){

			System.out.print(" ");
		}
	


		for(int count = number; count >= counter; count--){

			System.out.print(" ");
		}
		


		for(int count = 0; count <= counter; count++){

			System.out.print("*");
		}
		
		System.out.println();


		
	}


public static void allTriangleInOneLine(int number){
  
	for(int counter = 0; counter <= number; counter++){
		for(int count = 0; count <= counter; count++){

			System.out.print("*");
		}
		System.out.print(" ");
	}
	


}



}
}