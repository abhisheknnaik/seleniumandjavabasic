package basicJava;

public class CustomException {
	// ref : https://www.javatpoint.com/custom-exception
	/**
	 * @param args
	 * @throws InvalidAgeException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// int a = 7, b = 2;
			// int c = a / b;// out put will be 3 as we are using int , if you
			// want
			// out put 3.5 then change to float

			float a = 7, b = 2;
			float c = a / b;
			System.out.println(c);
			TestCustomException t = new TestCustomException();
			t.validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}
		System.out.println("rest of the code...");
	}
}

class TestCustomException {

	void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid Age");
		else
			System.out.println("welcome to vote");
	}
}

class InvalidAgeException extends Exception {

	InvalidAgeException(String s) {
		super(s);
	}
}
