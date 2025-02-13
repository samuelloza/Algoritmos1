package week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackJava {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.pop();
		myStack.pop();

		System.out.println(myStack.peek());
		
		Queue<String> queue = new LinkedList<String>();
		
		
	}

}
