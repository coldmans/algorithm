import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int j = 0; j < n; j++){
            String s = br.readLine();
            if(s.equals(".")){
                break;
            }
            Stack<Character> stack = new Stack<>();
            boolean isOk = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.add('(');
                }
                else if(s.charAt(i) == '['){
                    stack.add('[');
                }
                else if(s.charAt(i) == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        isOk = false;
                        break;
                    }
                }
                else if(s.charAt(i) == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isOk = false;
                        break;
                    }
                }
            }
            if(isOk && stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }





    }
}
