package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// arrayListEx();
		// linkListEx();
		vectortEx();
	}

	static void arrayListEx() {// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("abhishek");
		arrayList.add("Nilesh");
		arrayList.add("Vijay");
		arrayList.add("Ajay");
		arrayList.add("Vijay");
		System.out.println("Elements in list :" + arrayList);
		arrayList.add(1, "Jagadeesh");
		arrayList.add(3, "third");
		System.out.println("Elements in list :after add " + arrayList);
		arrayList.remove(2);
		arrayList.remove("Vijay");
		System.out.println("Elements in list :after remove" + arrayList);
		System.out.println(arrayList.get(2));
		System.out.println("index of Jagadeesh "
				+ arrayList.indexOf("Jagadeesh"));
		System.out.println("Last index " + arrayList.lastIndexOf("Vijay"));

		List<String> subListEx = arrayList.subList(2, 5);
		System.out.println("Sub list " + subListEx);
		List<String> myCopy = new ArrayList<String>();
		myCopy.add("My ABC");
		myCopy.addAll(arrayList);
		System.out.println("My Copy: " + myCopy);
		List<String> myCopy2 = new ArrayList<String>();
		myCopy2.add("a");
		myCopy2.add("a");
		myCopy2.add("a");
		myCopy2.add("a");
		myCopy2.add("a");
		myCopy2.add("a");
		myCopy2.addAll(3, arrayList);
		System.out.println("My Copy 2: " + myCopy2);
		/* For Loop for iterating ArrayList */
		System.out.println("****For Loop****");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		/* Advanced For Loop */
		System.out.println("***** Advanced For Loop*****");
		for (String str : arrayList) {
			System.out.println(str);
		}

		/* Looping Array List using Iterator */
		System.out.println("******Iterator****");
		Iterator iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collections.sort(arrayList);
		System.out.println("Sorted " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("Reverse " + arrayList);
		Collections.sort(myCopy2, Collections.reverseOrder());
		System.out.println("Reverse copy " + myCopy2);
		System.out.println("Contains " + myCopy2.contains("Vijay"));

		List<String> sublist = myCopy2.subList(1, 4);
		System.out.println("Sub list" + sublist);
		List<String> syncal = Collections
				.synchronizedList(new ArrayList<String>());

		// Adding elements to synchronized ArrayList
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized (syncal) {
			Iterator<String> iterator = syncal.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
		syncal.set(1, "update 1");
		System.out.println("After update" + syncal);

		System.out.println("before swap " + myCopy2);
		Collections.swap(myCopy2, 1, 4);
		System.out.println("after 1 4 swap " + myCopy2);

	}

	static void vectortEx() {// TODO Auto-generated method stub

		Vector<String> vectorEx = new Vector<String>();
		vectorEx.add("abhishek");
		vectorEx.add("Nilesh");
		vectorEx.add("Vijay");
		vectorEx.add("Ajay");
		vectorEx.add("Vijay");
		System.out.println("Elements in list :" + vectorEx);
		vectorEx.add(1, "Jagadeesh");
		vectorEx.add(3, "third");
		System.out.println("Elements in list :" + vectorEx);
		vectorEx.remove(2);
		vectorEx.remove("Vijay");
		System.out.println("Elements in list :" + vectorEx);
		System.out.println(vectorEx.get(2));
		System.out.println(vectorEx.indexOf("Jagadeesh"));

		/* For Loop for iterating ArrayList */
		System.out.println("****For Loop****");
		for (int i = 0; i < vectorEx.size(); i++) {
			System.out.println(vectorEx.get(i));
		}
		/* Advanced For Loop */
		System.out.println("***** Advanced For Loop*****");
		for (String str : vectorEx) {
			System.out.println(str);
		}

		/* Looping Array List using Iterator */
		System.out.println("******Iterator****");
		Iterator iter = vectorEx.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// Get Enumeration of Vector elements
		Enumeration en = vectorEx.elements();

		/*
		 * Display Vector elements using hashMoreElements() and nextElement()
		 * methods.
		 */
		System.out.println("Vector elements are using Enumeration ");
		while (en.hasMoreElements())
			System.out.println(en.nextElement());

	}

	static void linkListEx() {
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		linkList.addFirst(23);
		linkList.add(3);
		linkList.addFirst(33);
		linkList.addLast(100);
		linkList.add(102);
		linkList.add(2, 22);
		System.out.println("Elementes in list" + linkList);
		linkList.removeFirst();
		linkList.removeLast();

		System.out.println("Elementes in list" + linkList);
		System.out.println("Get element at index 2, " + linkList.get(2));

		// add element in the begining of list
		linkList.push(1);
		System.out.println("after push" + linkList);
		System.out.println("Removed " + linkList.pop());
		System.out.println("after pop" + linkList);

		/*
		 * pollFirst(): Retrieves and removes the first element of this list, or
		 * returns null if this list is empty.
		 */
		System.out.println("Element removed: " + linkList.pollFirst());

		System.out.println("Elementes in list after pollfirst" + linkList);

		// public E peek(): Retrieves, but does not remove, the head (first
		// element) of this list.
		// public E peekFirst(): Retrieves, but does not remove, the first
		// element of this list, or returns null if this list is empty.
		// public E peekLast(): Retrieves, but does not remove, the last element
		// of this list, or returns null if this list is empty

		// peek()
		System.out.println(linkList.peek());

		// peekFirst()
		System.out.println(linkList.peekFirst());

		// peekLast()
		System.out.println(linkList.peekLast());

		System.out
				.println("Elementes in list after peek ,peekfirst, peekLast (No change)"
						+ linkList);
		/*
		 * pollLast(): Retrieves and removes the Lasr element of this list, or
		 * returns null if this list is empty.
		 */
		System.out.println("Element removed: " + linkList.pollLast());
		System.out.println("Elementes in list after pollLast" + linkList);
		Collections.sort(linkList);
		System.out.println("Elementes in list after sort" + linkList);
		Collections.reverse(linkList);
		System.out.println("Elementes in list after sort" + linkList);
		// reverse iteration
		Iterator it = linkList.descendingIterator();
		// Displaying list in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// clone of list
		LinkedList<String> cloneList = (LinkedList<String>) linkList.clone();
		
	}
}