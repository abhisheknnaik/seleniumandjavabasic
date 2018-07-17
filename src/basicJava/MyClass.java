package basicJava;

public class MyClass {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.width = 10;
		box1.height = 20;
		box1.length = 22;
		box1.volume();
		
		Box box2 = new Box();
		box2.width = 12;
		box2.height = 23;
		box2.length = 21;
		box2.volume();		
	}
}

class Box {
	double width, height, length;
	public void volume() {
		
		System.out.println("Volume is " + width * height * length);
	}
}

