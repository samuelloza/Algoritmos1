package week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueStack2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack<Character>();
			String cad = sc.next();

			String solution = "";
			for (int j = 0; j < cad.length(); j++) {
				char input = cad.charAt(j);

				if (input >= 'a' && input <= 'z') {
					solution = solution + input;
				} else if (input == ')') {
					solution = solution + input;

					while(stack.peek() != '(') {
						solution = solution + stack.pop();
					}
					stack.pop();

				} else {
					stack.add(input);
				}
			}
			
			System.out.println(solution);
			/*while(!stack.isEmpty()) {
				if (stack.peek() != '(')
				System.out.print(stack.pop());
			}
			System.out.println();*/
		}
	}

}
