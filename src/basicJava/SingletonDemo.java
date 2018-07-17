package basicJava;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();
		//Singleton.demoMethod();
		
		// Compilation error :The constructor Singleton() is not visible
	//	Singleton singobj=new Singleton();

	}

}

class Singleton {

	private static Singleton singleton = new Singleton();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private Singleton() {
	}

	/* Static 'instance' method */
	public static Singleton getInstance() {
		return singleton;
	}

	/* Other methods protected by singleton-ness */
	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}

}
