import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            stack.add(Integer.parseInt(st.nextToken()));
        }
        int max = 0;
        int ctt = 0;
        while(!stack.isEmpty()){
            int t = stack.pop();
            if(t > max){
                ctt += 1;
                max = t;
            }
        }
        System.out.println(ctt);

    }
}
