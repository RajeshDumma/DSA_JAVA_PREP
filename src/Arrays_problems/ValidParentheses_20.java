
package Arrays_problems;

import java.util.Scanner;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack[++top] = ')';
            } else if (ch == '[') {
                stack[++top] = ']';
            } else if (ch == '{') {
                stack[++top] = '}';
            } else {
                if (top == -1 || stack[top--] != ch) {
                    System.out.println("false");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println(top == -1);
        sc.close();
    }
}
