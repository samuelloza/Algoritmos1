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
			Stack<Character> stack = new Stack<Character>();
			Queue<Character> queue = new LinkedList<Character>();
			String cad = sc.next();

			String ans = "";
			for (int j = 0; j < cad.length(); j++) {
				char aux = cad.charAt(j);

				if (aux >= 'a' && aux <= 'z') {
					queue.add(aux);
				} else if (aux == ')') {
					while (!queue.isEmpty()) {
						ans = ans + queue.poll();
					}

					while(stack.peek() != '(') {
						ans = ans + stack.pop();
					}
					stack.pop();

				} else {
					stack.add(aux);
				}
			}
			
			System.out.println(ans);
			/*while(!stack.isEmpty()) {
				if (stack.peek() != '(')
				System.out.print(stack.pop());
			}
			System.out.println();*/
		}
	}

}
