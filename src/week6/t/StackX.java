package week6.t;

public class StackX {

	private int maxSize;
	private int[] stackArray;
	private int top;

	public StackX(int s) {
		maxSize = s;
		stackArray = new int[s];
		top = -1;
	}

	public void push(int value) {
		top++;
		stackArray[top] = value;
	}

	public int pop() {
		int value = stackArray[top];
		top--;
		return value;
	}

	public int peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

		while (!theStack.isEmpty()) {
			int value = theStack.pop();
			System.out.println(value);
		}
		System.out.println("");
	}
}
