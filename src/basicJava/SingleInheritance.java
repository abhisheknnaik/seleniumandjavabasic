package basicJava;

public class SingleInheritance {

	public static void main(String[] args) {
		A superOb = new A();
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		
		/* The subclass has access to all public members of
		its superclass. */
		B subOb = new B();
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
		System.out.println();
		// Overriding example 
		// child can not point to base class
		//subOb=new A();
		// super class object pointing to sub class
		System.out.println("Overriding ex");
		A superObj=new B();
		superObj.i=5;
		superObj.j=14;
		superObj.showij();
	}
}

// A simple example of inheritance.
// Create a superclass.
class A {
	int i, j;
	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by extending class A.
class B extends A {
	int k;
	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
	
	void showij() {
		System.out.println("In Sub class ,i and j: " + i + " " + j);
	}
}