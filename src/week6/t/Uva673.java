package week6.t;

import java.util.Scanner;
import java.util.Stack;

public class Uva673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String cad = sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < cad.length(); j++) {
				char value = cad.charAt(j);
				if (value == '(' || value == '[') {
					stack.push(value);
				} else {
					if (stack.isEmpty()) {
						stack.push(value);
					}
					char oldValue = stack.peek();
					if (value == ')' && oldValue == '(') {
						stack.pop();
					} else {
						if (value == ']' && oldValue == '[') {
							stack.pop();
						} else {
							stack.push(value);
						}
					}

				}
			}
			if (stack.size() == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
