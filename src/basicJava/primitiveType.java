package basicJava;

public class primitiveType {
	public static void main(String[] args) {
		// primitiveTypeEx();
		//longEx();
		 doubleEx();
		// booleanEx();
		 typeConversionEx();
	}

	public static void primitiveTypeEx() {
		byte byteV = 127;
		short shortV = 32767;
		int intVar = 2147483647;
		char ch1 = 'X';

		System.out.println("Value of byteV is " + byteV);
		System.out.println("Value of shortV is " + shortV);
		System.out.println("Value of intVar is " + intVar);
		System.out.println("Value of ch1 is " + ch1);
	}

	public static void longEx() {
		int lightspeed;
		long totalSecondsInDay;
		long distance;
		// approximate speed of light in miles per second
		lightspeed = 186000;
		totalSecondsInDay = 24 * 60 * 60; // convert to seconds

		// distance=speed*time
		distance = lightspeed * totalSecondsInDay; // compute distance
		System.out.print("In a day light will travel about " + distance
				+ " miles.");
	}

	public static void doubleEx() {
		double pi, radius, area;
		float areaInFloat;
		radius = 10.82; // radius of circle
		pi = 3.1416; // pi, approximately
		area = pi * radius * radius; // compute area
		System.out.println("Area of circle is " + area);
		// Type Casting
		areaInFloat = (float) area;
		System.out.println("Area of circle using float " + areaInFloat);
	}

	public static void booleanEx() {
		boolean b;
		// System.out.println("b is " + b);
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);
	}

	public static void typeConversionEx() {
		short shortV = 32767;
		int intVar;
		// Type conversion
		intVar = shortV;
		System.out.println("Value of intVar after Type Conversion " + intVar);
	}
}
