package basicJava;

public class StringBuilderVsBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Strig Buffer :
		// 1 StringBuffer is synchronized i.e. thread safe. It means two threads
		// can't call the methods of StringBuffer simultaneously.
		// 2 StringBuffer is less efficient (slower) than StringBuilder.
		// StringBuilder :
		// 1 StringBuilder is non-synchronized i.e. not thread safe. It means two
		// threads can call the methods of StringBuilder simultaneously
		// 2 StringBuilder is more efficient/faster  than StringBuffer.
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 100000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: "
				+ (System.currentTimeMillis() - startTime) + "ms");
		long startTime1 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 100000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: "
				+ (System.currentTimeMillis() - startTime1) + "ms");

	}

}
