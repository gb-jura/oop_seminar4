public class task2 {
public static <T> void printArray(T[] arr) {
	for (T elem : arr) {
		System.out.print(elem + " ");
	}
	System.out.println();
}

public static void main(String[] args) {
	Integer[] intArr = {1, 2, 3, 4, 5};
	printArray(intArr);
	
	String[] strArr = {"apple", "banana", "cherry", "dragonfruit"};
	printArray(strArr);
}
}
