package basicJava;

public class ThrowsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThrowsExample tx = new ThrowsExample();
		try{
			   System.out.println(tx.division(15,0));  
			}
			catch(ArithmeticException e){
			   System.out.println("You shouldn't divide number by zero : exception"+e.getMessage());
			}


	}

	int division(int a, int b) throws ArithmeticException{  
		int t = a/b;
		return t;
	   }  

}
