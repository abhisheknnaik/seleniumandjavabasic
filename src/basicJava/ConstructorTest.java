package basicJava;

public class ConstructorTest {

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		cd.display();
		
		
		Demo demo=new Demo(1);
		demo.display();
		Demo demo2=new Demo(1,2);
		demo2.display();
		Demo demo3=new Demo();
				
	}
}

class ConstructorDemo {
	int value1;
	int value2;

	ConstructorDemo() {
		value1 = 10;
		value2 = 20;
		System.out.println("Inside Constructor");
	}

	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}
}

class Demo {
	int value1;
	int value2;

	
	  Demo(){ value1 = 10; value2 = 20;
	  System.out.println("Inside 1st Constructor"); }
	 
	Demo(int a) {
		value1 = a;
		System.out.println("Inside 2nd Constructor");
	}

	Demo(int a, int b) {
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd Constructor");
	}

	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}
}