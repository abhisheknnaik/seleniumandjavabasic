package basicJava;





public class TryCatchFinalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tryCatch();
		
		
	}

	static int tryCatch() 
	{
		
		try{
			int a=0,b=5;
			System.out.println(b/a);
			System.out.println("in try"); 
			return b/a;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Exit without finally");
			System.exit(0);
		}
		finally
		{
			System.out.println("in finally");
			return 1;
		}
		
	}
}
