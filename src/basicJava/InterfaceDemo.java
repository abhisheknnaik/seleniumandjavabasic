package basicJava;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Pet p=new Pet();
		Cat c = new Cat();
		c.test();
		Dog d = new Dog();
		d.test();
		Pet p = new Dog();
	}
}

interface Pet {
	int petCount = 2;

	void test();

	void myMethod();
}

class DemoTest {
	public void test() {
	}
}

interface Animal {
	void test();
}

class Dog extends DemoTest implements Pet, Animal {
	@Override
	public void test() {
		// The final field Pet.petCount cannot be assigned
		// Variable define in the interface are by default public, static and
		// Final
		// hence can not change value of it
		// petCount=5;
		System.out.println("Interface implemented");
		System.out.println("Pet count"+petCount);
	}

	public void myMethod() {
		System.out.println("Interface implemented myMethod");
	}
}

class Cat implements Pet {
	@Override
	public void test() {
		System.out.println("Interface implemented");
	}

	public void myMethod() {
		System.out.println("Interface implemented myMethod");
	}
}
