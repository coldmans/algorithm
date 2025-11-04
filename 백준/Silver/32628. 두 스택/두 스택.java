import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        long s1 = 0;
        long s2 = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            stack1.add(x);
            s1 += x;
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            stack2.add(x);
            s2 += x;
        }

        for(int i = 0; i < K; i++){
            if(s1 > s2 && !stack1.isEmpty()){
                s1 -= stack1.pop();
            }
            else{
                if(stack2.isEmpty()){
                    if(!stack1.isEmpty()) s1 -= stack1.pop();
                }
                else {
                    s2 -= stack2.pop();
                }
            }
        }

        System.out.println(s1 > s2 ? s1 : s2);


    }
}
