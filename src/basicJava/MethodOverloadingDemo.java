package basicJava;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Double result;
		OverloadDemo ob = new OverloadDemo();
		// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		ob.test(10.223, 23.34);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);
	}
}

class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// Overload test for two integer double.
	void test(double a, double b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// overload test for a double parameter
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

	// We can not overload method only base on return type ,their will be
	// exception if we try to do that
	// Exception : Duplicate method test(double) in type OverloadDemo
	/*
	 * int test(double a) { System.out.println("double a: " + a); return a * a;
	 * }
	 */
}
