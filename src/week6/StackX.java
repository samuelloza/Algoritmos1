package week6;

import java.util.ArrayList;

class MyStack2 {
	private ArrayList<Integer> vec;
	
	public MyStack2() {
		vec = new ArrayList<Integer>();
	}
	
	public void push(int value) {
		vec.add(value);
	}
	
	public int pop() {
		int value = vec.get(vec.size() - 1);
		vec.remove(vec.size() - 1);
		return value;
	}
	
	public int peek() {
		return vec.get(vec.size() - 1);
	}
	
	public boolean isEmpty() {
		return vec.isEmpty();
	}
}

public class StackX {

	public static void main(String[] args) {
		MyStack2 myStack = new MyStack2();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.pop();
		myStack.pop();
		myStack.pop();


		System.out.println(myStack.peek());
	}

}
