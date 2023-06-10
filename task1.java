public class task1 {
public static <T> void printElement(T element) {
	System.out.println(element);
}

public static void main(String[] args) {
	Integer num = 5;
	String str = "Hello World!";
	Double dbl = 3.14;
	
	printElement(num);
	printElement(str);
	printElement(dbl);
}
}

