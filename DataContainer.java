import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

private T[] data;

public DataContainer() {
	this.data = (T[]) new Object[0];
}

public void add(T element) {
	T[] newArray = Arrays.copyOf(data, data.length + 1);
	newArray[data.length] = element;
	data = newArray;
}

public T get(int index) {
	if (index < 0 || index >= data.length) {
		return null;
	}
	return data[index];
}

public void sort(Comparator<T> comparator) {
	Arrays.sort(data, comparator);
}

public void print() {
	for (T element : data) {
		System.out.println(element);
	}
}
}
