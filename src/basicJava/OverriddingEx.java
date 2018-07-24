package basicJava;

public class OverriddingEx {

	public static void main(String[] args) {
		A1 superOb = new A1();
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		superOb.publicBaseMethod();
		// The method privateBaseMethod() from the type A1 is not visible
		// superOb.privateBaseMethod();

		System.out.println();
		B1 subclass = new B1();
		subclass.privateBaseMethod();
	}
}

// A simple example of inheritance.
// Create a superclass.
class A1 {
	int i, j;

	int showij() {
		System.out.println("i and j: " + i + " " + j);
		return 10;
	}

	public void publicBaseMethod() {
		System.out.println("i and j: " + i + " " + j);
	}

	protected void protectedBaseMethod() {
		System.out.println("i and j: " + i + " " + j);
	}

	private void privateBaseMethod() {
		System.out.println("private base method");
	}
}

// Create a subclass by extending class A.
class B1 extends A1 {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}

	// -----------------------------
	// The return type is incompatible with A1.showij()
	// double showij() {
	// System.out.println("In Sub class ,i and j: " + i + " " + j);
	// return 10.2;
	// }
	// -----------------
	int showij() {
		System.out.println("In Sub class ,i and j: " + i + " " + j);
		return 10;
	}

	// Cannot reduce the visibility of the inherited method from A1
	// protected void publicBaseMethod() {
	// System.out.println("i and j: " + i + " " + j);
	// }

	// We increase the visibility
	public void protectedBaseMethod() {
		System.out.println("i and j: " + i + " " + j);
	}

	void privateBaseMethod() {
		System.out.println("private base method in sub class");
	}
}