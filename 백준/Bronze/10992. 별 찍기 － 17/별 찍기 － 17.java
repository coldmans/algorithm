import java.io.*;
import java.util.*;

public class Main {

    static int []vx = new int[]{1, 0, -1, 0};
    static int []vy = new int[]{0, -1, 0, 1};
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N * 2 - 1; i++){
            sb.append("*");
        }
        stack.add(sb);
        int wax = N * 2 - 5;
        for(int i = 1; i < N; i++){
            StringBuilder sb2 = new StringBuilder();
            for(int j = 0; j < i; j++){
                sb2.append(" ");
            }
            sb2.append("*");

            for(int j = 0; j < wax; j++){
                sb2.append(" ");
            }
            if(i != N-1) {
                sb2.append("*");
            }
            wax -= 2;
            stack.add(sb2);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }







    }
}
