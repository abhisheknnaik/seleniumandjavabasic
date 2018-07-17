package collectionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SerializationMap {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// Ref :
		// https://beginnersbook.com/2013/12/how-to-serialize-hashmap-in-java/

		serializeEx();
		deSerialization();
	}

	public static void serializeEx() {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		// Adding elements to HashMap
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3, "IJ");
		try {
			// it will store the hashmap.ser file at root folder of project
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			System.out
					.println("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void deSerialization() throws IOException, ClassNotFoundException
	{
		HashMap<Integer,String> hmap=null;
		FileInputStream fis=new FileInputStream("hashmap.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		hmap=(HashMap)ois.readObject();
		
		Set set=hmap.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iter.next();
			System.out.println(mentry.getKey() +" "+mentry.getValue() );
		}
		
	}	
	
}
