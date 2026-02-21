import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < n; i++){
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                if(!stack.isEmpty() && stack.peek() == s.charAt(j)){
                    stack.pop();
                }
                else{
                    stack.add(s.charAt(j));
                }
            }
            if(stack.isEmpty()){
                ans += 1;
            }
        }

        System.out.println(ans);


    }
}
