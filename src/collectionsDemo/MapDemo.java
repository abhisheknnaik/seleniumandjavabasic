package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		hashMapEx();
		treeMapEx();
		linkedMapEx();
	}

	static void hashMapEx() {
		System.out.println("Hash Map");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(15, "Aa");
		map.put(5, "Dd");
		map.put(3, "Ketan");
		map.put(9, "Pp");
		map.put(4, "Rajesh");
		map.put(6, "Hp");
		map.put(2, "Tina");
		map.put(2, "Jisha");
		map.remove(3);

		System.out.println(map);
		System.out.println("Get " + map.get(2));
		System.out.println("Contains key" + map.containsKey(9));
		System.out.println("Contains value " + map.containsValue("Pp"));
		for (Map.Entry me : map.entrySet()) {
			System.out.println("Key :" + me.getKey() + " Value :"
					+ me.getValue());
		}
		System.out.println("using iterator");
		/* Display content using Iterator */
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		// clone of hashMap
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2 = (HashMap) map.clone();
		System.out.println(map2);
	}

	static void treeMapEx() {
		System.out.println("Tree Map");
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(15, "Aa");
		map.put(3, "Ketan");
		map.put(4, "Rajesh");
		map.put(5, "Dd");
		map.put(9, "Pp");
		map.put(6, "Hp");
		map.put(2, "Tina");
		map.put(2, "Jisha");
		System.out.println(map);
		for (Map.Entry me : map.entrySet()) {
			System.out.println("Key :" + me.getKey() + " Value :"
					+ me.getValue());
		}
		System.out.println("using iterator");
		/* Display content using Iterator */
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

	}

	static void linkedMapEx() {
		System.out.println("Linked hash a Map");
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(15, "Aa");
		map.put(20, "Aa");
		map.put(7, "Aa");
		map.put(3, "Ketan");
		map.put(4, "Rajesh");
		map.put(5, "Dd");
		map.put(9, "Pp");
		map.put(6, "Hp");
		map.put(2, "Tina");
		map.put(2, "Jisha");
		System.out.println(map);

		for (Map.Entry me : map.entrySet()) {
			System.out.println("Key :" + me.getKey() + " Value :"
					+ me.getValue());
		}
		System.out.println("using iterator");
		/* Display content using Iterator */
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
	}

}
