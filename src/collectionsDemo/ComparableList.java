package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableList {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Ref : https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
		//if value of compare is -ve then swap is done
		ArrayList<StudentComparable> arraylist = new ArrayList<StudentComparable>();
		arraylist.add(new StudentComparable(223, "Chaitanya", 26));
		arraylist.add(new StudentComparable(245, "Rahul", 24));
		arraylist.add(new StudentComparable(209, "Ajeet", 32));

		// Collections.sort(arraylist); 
		// compiler failure for Collections.sort if Comparable interface is not implemented 
		// Bound mismatch: The generic method sort(List<T>) of type Collections
		// is not applicable for the arguments (ArrayList<Student>). The
		// inferred type Student is not a valid substitute for the bounded
		// parameter <T extends Comparable<? super T>>

		Collections.sort(arraylist); 
		
		for (StudentComparable str : arraylist) {
			System.out.println(str.getStudentage() +" " +str.getRollno()+" " +str.getStudentname());
		}
	}

}
