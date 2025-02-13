package week6.implemtations;

class MyStack {
	private int vec[];
	private int size;
	private int maxSize;
	
	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		this.vec = new int[maxSize];
		this.size = -1;
	}
	
	public void push(int value) {
		size++;
		vec[size] = value;
	}
	
	public int pop() {
		int value = vec[size];
		size--;
		return value;
	}
	
	public int peek() {
		return vec[size];
	}
	
	public boolean isEmpty() {
		if (size == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (size == maxSize) {
			return true;
		}
		return false;
	}
}

public class StackArrayList {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(10);
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();

		System.out.println(myStack.peek());
	}

}
