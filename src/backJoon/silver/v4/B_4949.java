package backJoon.silver.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean is = false;
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                }
                else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        is = true;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        is = true;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                    }
                }
            if (is) {
                System.out.println("no");
                is = false;
            }
            else if (stack.isEmpty()) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
