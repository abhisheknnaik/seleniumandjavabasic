package basicJava;

public class multiLevelInheritance {

	public static void main(String[] args) {
		Shipment shipment1 =
				new Shipment(10, 20, 15, 10, 3.41);
								double vol;
				vol = shipment1.volume();
				System.out.println("Volume of shipment1 is " + vol);
				System.out.println("Weight of shipment1 is "
				+ shipment1.weight);
				System.out.println("Shipping cost: $" + shipment1.cost);
	}
}

// Extend BoxWeight to include shipping costs.
// Start with Box.
class BoxClass {
	private double width;
	private double height;
	private double depth;

	// constructor used when all dimensions specified
	BoxClass(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		System.out.println("In Box Class");
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Add weight.
class BoxWeight extends BoxClass {
	double weight; // weight of box	
	// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
		System.out.println("In Box Weight");
	}
}

// Add shipping costs.
class Shipment extends BoxWeight {
	double cost;

	// constructor when all parameters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m); // call superclass constructor
		cost = c;
		System.out.println("In Shipment ");
	}
}
