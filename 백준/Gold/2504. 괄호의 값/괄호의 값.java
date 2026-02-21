import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        int ans = 0;
        int tmp = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
                tmp *= 2;
            } else if (c == '[') {
                stack.push(c);
                tmp *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    System.out.println(0);
                    return;
                }
                // "()"면 현재 tmp를 더함
                if (i > 0 && s.charAt(i - 1) == '(') {
                    ans += tmp;
                }
                stack.pop();
                tmp /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println(0);
                    return;
                }
                
                if (i > 0 && s.charAt(i - 1) == '[') {
                    ans += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}