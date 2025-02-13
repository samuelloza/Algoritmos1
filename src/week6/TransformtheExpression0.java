package week6;

import java.util.Scanner;
import java.util.Stack;

public class TransformtheExpression0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String cad = sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
			String sol = "";
			for (int j = 0; j < cad.length(); j++) {
				if (cad.charAt(j) >= 'a' && cad.charAt(j) <= 'z') {
					sol = sol + cad.charAt(j) + "";
				} else if (cad.charAt(j) == '(') {
					stack.push(cad.charAt(j));
				} else if (cad.charAt(j) == ')') {
					while(!stack.isEmpty() && stack.peek() != '(') {
						sol = sol + stack.pop() + "";
					}
					stack.pop();
				} else {
					stack.push(cad.charAt(j));
				}
			}
			System.out.println(sol);
		}
	}
}
