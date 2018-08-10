package basicJava;
public class AbstractClass {
	public static void main(String[] args) {
		// We can not create a object of abstract class
		 //Shap s=new Shap();
		Rectangle rectangle = new Rectangle();
		rectangle.length = 5;
		rectangle.height = 4;
		rectangle.area(); 
	}
}

abstract class Shap {

	// concrete (complete) method
	public void display() {
		System.out.println("In Display class");
	}
	// abstract method
	abstract public void area();
	
	// This method requires a body instead of a semicolon
	  //Shap();
	Shap()
	 {
		 System.out.println("In abstract class constractor ");
	 }
}

class Rectangle extends Shap {
	int length, height;
	public void area() {
		System.out.println("Area is " + length * height);
	}
	
	
}

