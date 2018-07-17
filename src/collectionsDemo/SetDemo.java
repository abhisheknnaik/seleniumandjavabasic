package collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		hashSetEx();
		//treeSetEx();
		//linkedHashSetEx();
	}

	static void hashSetEx() {
		System.out.println("Hash set");
		HashSet<String> hs = new HashSet<String>();
		hs.add("Abhi");
		hs.add("sachin");
		hs.add("poonam");
		hs.add("Bhushan");
		hs.add("poonam");
		System.out.println("Elementes " + hs);

		// Creating an Array
		String[] array = new String[hs.size()];
		hs.toArray(array);
		System.out.println("Elementes array " + array);
		for(String s :array)
		{
			System.out.println(s);
		}

		// Creating a TreeSet of HashSet elements
		Set<String> tset = new TreeSet<String>(hs);
		System.out.println("Elementes tset " + tset);

		// Creating a List of HashSet elements
		List<String> list = new ArrayList<String>(hs);
		System.out.println("Elementes list " + list);
		
		// covert array list to set(remove duplicate values)
		List<String> listDup = new ArrayList<String>();
		listDup.add("first");
		listDup.add("second");
		listDup.add("third");
		listDup.add("forth");
		listDup.add("first");
		listDup.add("third");
		System.out.println("List with duplicate "+listDup);
		Set<String> setWithoutDup=new HashSet<String>(listDup);
		System.out.println("Set without duplicate "+setWithoutDup);
	}

	static void treeSetEx() {
		System.out.println("Tree set");
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("Abhi");
		hs.add("Abhi");
		hs.add("sachin");
		hs.add("poonam");
		hs.add("Bhushan");
		System.out.println("Elementes " + hs);
	}

	static void linkedHashSetEx() {
		System.out.println("link set");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Abhi");
		lhs.add("Abhi");
		lhs.add("sachin");
		lhs.add("poonam");
		lhs.add("Bhushan");
		System.out.println("Elementes " + lhs);
		
	}
}
