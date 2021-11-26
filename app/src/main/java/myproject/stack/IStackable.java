package myproject.stack;

public interface IStackable<T> {
	void push(T var1);

	T pop();

	T peek();

	boolean isEmpty();

	int size();

	void clear();

	void print();
}
