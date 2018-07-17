package basicJava;

public class StaticDemo {

	static
	{
		System.out.println("In static block , it will be called before main method");
	}
	public static void main(String[] args) {
		StudentStat s1 = new StudentStat();
		s1.showData();

		StudentStat s2 = new StudentStat();
		s2.showData();

		StudentStat s3 = new StudentStat();
		s3.a++;
		StudentStat.b++;
		s3.showData();
		//Student.increment();
		
		studentSubClass.staticMethod();
	}
}


class StudentStat {
	int a; // initialized to zero
	static int b; // initialized to zero only when class is loaded not for each
					// object created.

	StudentStat() {
		// Constructor incrementing non instance variable
		a++;
		// Constructor incrementing static variable b
		b++;
	}

	public static void staticMethod()
	{
		System.out.println("In static method");
	}
	public void showData() {
		//Illegal modifier for parameter ver; only final is permitted
		//static int ver=10;
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}

//public static void increment() {
//	//	a++;
//	}
}


class studentSubClass extends StudentStat {
	//@Override
	public static void staticMethod()
	{
		System.out.println("In sub static method");
	}
}
