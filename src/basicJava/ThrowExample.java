package basicJava;

public class ThrowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThrowExample tx = new ThrowExample();
		tx.checkAge(10);

	}

	void checkAge(int age) {
		if (age < 18)
			throw new ArithmeticException("Not Eligible for voting");
		else
			System.out.println("Eligible for voting");
	}

}
