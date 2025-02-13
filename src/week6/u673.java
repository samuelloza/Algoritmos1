package week6;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Stack;

class MyStackCustom {
	private ArrayList<Character> vec;
	
	public MyStackCustom() {
		vec = new ArrayList<Character>();
	}
	
	public void push(char value) {
		vec.add(value);
	}
	
	public char pop() {
		char value = vec.get(vec.size() - 1);
		vec.remove(vec.size() - 1);
		return value;
	}
	
	public char peek() {
		return vec.get(vec.size() - 1);
	}
	
	public boolean isEmpty() {
		return vec.isEmpty();
	}
	
	public int size() {
		return vec.size();
	}
}

public class u673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String cad = sc.nextLine();
			MyStackCustom myStack = new MyStackCustom();
			for (int j = 0; j < cad.length(); j++) {
				if (cad.charAt(j) == '(' || cad.charAt(j) == '[' ) {
					myStack.push(cad.charAt(j));
				} else {
					if (myStack.isEmpty()) {
						myStack.push(cad.charAt(j));
					}
					char lastElement = myStack.peek();
					char nextElement = cad.charAt(j);
					if (lastElement == '(' && nextElement == ')') {
						myStack.pop();
					} else if (lastElement == '[' && nextElement == ']') {
						myStack.pop();
					}
				}
			}
			System.out.println(myStack.size());
		}
	}

}



