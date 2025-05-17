import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            String arg = sc.next();
            if(arg.equals("push")){
                int tmp = sc.nextInt();
                stack.push(tmp);
            } 
            else if(arg.equals("pop")){
                System.out.println(stack.pop());
            }
            else if(arg.equals("size")){
                System.out.println(stack.size());
            }
            else if(arg.equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(arg.equals("top")){
                System.out.println(stack.peek());
            }
        }
    }
}