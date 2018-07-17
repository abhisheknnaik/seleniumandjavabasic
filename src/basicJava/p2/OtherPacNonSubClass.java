package basicJava.p2;
import basicJava.p1.Protection;
public class OtherPacNonSubClass {
	// Other package non sub class
	OtherPacNonSubClass() {
		Protection p = new Protection();
		System.out.println("other package constructor");
		// class or package only
		// System.out.println("n = " + p.n_NoModifier);
		// class only
		// System.out.println("n_pri = " + p.n_pri);
		// class, subclass or package only
		// System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
