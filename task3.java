public class task3 {

public static <T extends Comparable<T>> T getMax(T a, T b) {
	if (a.compareTo(b) > 0) {
		return a;
	} else {
		return b;
	}
}

public static void main(String[] args) {
	Integer maxInt = getMax(5, 10);
	Double maxDouble = getMax(3.14, 2.71);
	String maxString = getMax("hello", "world");
	
	System.out.println("Max integer: " + maxInt);
	System.out.println("Max double: " + maxDouble);
	System.out.println("Max string: " + maxString);
}
}
