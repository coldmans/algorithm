import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.add('(');
            }
            else{
                stack.pop();
                if(i > 0 && s.charAt(i-1) == '('){
                    ans += stack.size();
                }
                else{
                    ans += 1;
                }

            }
        }



        System.out.println(ans);


    }
}
