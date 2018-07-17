package basicJava;

public class FinalDemo {
	public static void main(String[] args) {
		MyDemoClass demo = new MyDemoClass();
		//demo.finalInt=15;
	}
}

class MyDemoClass {
	final int finalInt = 10;
	public final void myFinalMethod() {
	}
}

class DeriveClass extends MyDemoClass {
// public void myFinalMethod()
//	 {}
}
final class MyFinalClass {
	public void add(int a, int b) {
		System.out.println("addition of a and b is " + a + b);
	}
}

// class FinalExtends extends MyFinalClass{}