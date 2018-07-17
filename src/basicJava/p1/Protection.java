package basicJava.p1;
public class Protection {
	int n_NoModifier = 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;
	public Protection() {
	System.out.println("base constructor (in Protection class)");
	System.out.println("n_NoModifier = " + n_NoModifier);
	System.out.println("n_pri = " + n_pri);
	System.out.println("n_pro = " + n_pro);
	System.out.println("n_pub = " + n_pub);
	}
}
