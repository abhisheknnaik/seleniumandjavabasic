package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorList {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Ref : https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
		//if value of compare is -ve then swap is done
		ArrayList<StudentComparator> arraylist = new ArrayList<StudentComparator>();
		   arraylist.add(new StudentComparator(101, "Zues", 26));
		   arraylist.add(new StudentComparator(505, "Abey", 24));
		   arraylist.add(new StudentComparator(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, StudentComparator.StuNameComparator);

		   for(StudentComparator str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("RollNum Sorting:");
		   Collections.sort(arraylist, StudentComparator.StuRollno);
		   for(StudentComparator str: arraylist){
				System.out.println(str);
		   }
		   
		   /* Sorting on Age property*/
		   System.out.println("Age Sorting:");
		   Collections.sort(arraylist, StudentComparator.StudAge);
		   for(StudentComparator str: arraylist){
				System.out.println(str);
		   }
		}

	

}
