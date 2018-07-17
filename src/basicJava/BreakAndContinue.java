package basicJava;

public class BreakAndContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int random=(int)(Math.random()*500);
		System.out.println(random);
		// TODO Auto-generated method stub
		int counter;
		System.out.println("Break");
		for (counter = 0; counter < 10; counter++) {
			System.out.println(counter);
			if (counter == 4) {
				break;
			}
		}
		System.out.println("Continue");
		for (counter = 0; counter < 10; counter++) {
			System.out.println(counter);
			if (counter == 4) {
				continue;
			}
			System.out.println("This will not get printed when counter is 4");
		}
	}

}
