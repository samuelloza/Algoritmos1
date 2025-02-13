package week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Stack<Character> pila = new Stack<Character>();
			Queue<Character> cola = new LinkedList<Character>();
			String cad = sc.next();

			String solution = "";
			for (int j = 0; j < cad.length(); j++) {
				char input = cad.charAt(j);

				if (input >= 'a' && input <= 'z') {
					cola.add(input);
				} else if (input == ')') {
					while (!cola.isEmpty()) {
						solution = solution + cola.poll();
					}

					while(pila.peek() != '(') {
						solution = solution + pila.pop();
					}
					pila.pop();

				} else {
					pila.add(input);
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
