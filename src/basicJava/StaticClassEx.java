package basicJava;

import basicJava.OuterClass.NestedStaticClass;

public class StaticClassEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create instance of nested Static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();

		// call non static method of nested static class
		printer.printMessage();
		
		// inner static method can be access without creating instance
		NestedStaticClass.innertStaticMethod();

		// In order to create instance of Inner class we need an Outer class
		// instance. Let us create Outer class instance for creating
		// non-static nested class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		// calling non-static method of Inner class
		inner.display();

		// we can also combine above steps in one step to create instance of
		// Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

		// similarly we can now call Inner class method
		innerObject.display();

	}
}

class OuterClass {
	private static String msg = "GeeksForGeeks";
	private String nonStaticVeriable = "abhi";

	private static void staticMethod() {
		System.out.println("in Static method");
	}

	private void nonStaticMethod() {
		System.out.println("in non Static method");
	}

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class is directly accessible in nested
		// static class
		public void printMessage() {

			// can access static variable of outer class
			System.out.println("Message from nested static class: " + msg);

			// Cannot make a static reference to the non-static field
			// nonStaticVeriable
			// System.out.println("Access non static " + nonStaticVeriable);

			// can access static method of outer class
			staticMethod();

			// Cannot make a static reference to the non-static method
			// nonStaticMethod() from the type OuterClass
			// nonStaticMethod();

		}
		
		public  static void innertStaticMethod()
		{
			System.out.println("In inner static method");
		}
	}

	// non-static nested class - also called Inner class
	public class InnerClass {

		// Both static and non-static members of Outer class are accessible in
		// this Inner class
		public void display() {
			System.out.println("Message from non-static nested class: " + msg);
		}
	}
}
