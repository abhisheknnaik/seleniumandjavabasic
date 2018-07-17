package basicJava.p1;
public class Derived extends Protection {
// same package sub class 
	Derived() {
		System.out.println("derived constructor");
		System.out.println("n_NoModifier = " + n_NoModifier);
		// class only
		//System.out.println("n_pri = "+ n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
		}
}
