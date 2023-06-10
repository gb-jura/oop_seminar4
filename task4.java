public class task4 {
public static void main(String[] args) {
	DataContainer<String> container = new DataContainer<>();
	container.add("apple");
	container.add("orange");
	container.add("banana");
	container.print();
	container.sort((s1, s2) -> s2.compareTo(s1));
	container.print();
}
}
