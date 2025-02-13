package week6.t;

import java.util.ArrayList;

public class StackArray {

	private ArrayList <Integer> stack ;

	public StackArray() {
		 stack = new ArrayList<Integer>();
	}

	public void push(int value) {
		stack.add(value);
	}

	public int pop() {
		int value = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return value;
	}

	public int peek() {
		return stack.get(stack.size() - 1);
	}

	public boolean isEmpty() {
		return stack.size() == 0;
	}

	public static void main(String[] args) {
		StackArray theStack = new StackArray();
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
