package week6.t2;

import java.util.Scanner;
import java.util.Stack;

public class StrangeBalls0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();

            if (!stack.isEmpty() && stack.peek() == tmp) {
                count.push(count.pop() + 1);
                ans++;

                if (count.peek() == tmp) {
                    ans -= tmp;
                    stack.pop();
                    count.pop();
                }
            } else {
                stack.push(tmp);
                count.push(1);
                ans++;
            }

            System.out.println(ans);
        }
    }
}


