package basicJava;

public class StringEqualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "Hello World";
		String str2 = "Hello World";

		if (str1.equals(str2)) {// this condition is true
			System.out.println("str1 and str2 are equal in terms of values");
		}

		if (str1 == str2) {
			// This condition is  true
			System.out.println("Both strings are referencing same object");
		}
		else
		{
			// This condition is not true
			System.out
					.println("Both strings are referencing different objects");
		}
	}

}
