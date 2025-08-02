package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }
            else if (input == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append(stack.pop() + "\n");
                }
            }
            else if (input == 3) {
                sb.append(stack.size()+ "\n");
            }
            else if (input == 4) {
                if (stack.isEmpty()) {
                    sb.append(1 + "\n");
                }else {
                    sb.append(0 + "\n");
                }
            }
            else if (input == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
