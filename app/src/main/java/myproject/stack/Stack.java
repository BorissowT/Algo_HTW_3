//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myproject.stack;

public class Stack<T> implements IStackable<T> {
	Stack<T>.Node head = null;

	public Stack() {
	}

	public void push(T data) {
		Stack<T>.Node memorized = this.head;
		this.head = new Stack.Node();
		this.head.data = data;
		this.head.next = memorized;
	}

	public T pop() {
		if (this.head == null) {
			return null;
		} else {
			T retObj = this.head.data;
			this.head = this.head.next;
			return retObj;
		}
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public T peek() {
		return this.head == null ? null : this.head.data;
	}

	public int size() {
		Stack<T>.Node temp = this.head;

		int counter;
		for(counter = 0; temp != null; temp = temp.next) {
			++counter;
		}

		return counter;
	}

	public void clear() {
		this.head = null;
	}

	public void print() {
		for(Stack.Node temp = this.head; temp != null; temp = temp.next) {
			System.out.println(temp.data);
		}

	}

	private class Node {
		T data;
		Stack<T>.Node next;

		private Node() { }
	}
}
