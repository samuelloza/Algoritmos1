package week6.t;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> theStack = new Stack<Integer>();
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
