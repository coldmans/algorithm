import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        Stack <Character> fstack = new Stack<>();
        Stack <Character> rstack = new Stack<>();
        int N = Integer.parseInt(st.nextToken());
        Stack <Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            if(M != 3){
                char t = st.nextToken().charAt(0);
                if(M == 1){
                    fstack.add(t);
                    stack.add(0);
                }
                else if(M == 2){
                    rstack.add(t);
                    stack.add(1);
                }
            }
            else{
                if(!stack.isEmpty()){
                    if(stack.pop() == 0){
                        fstack.pop();
                    }
                    else{
                        rstack.pop();
                    }
                }
            }
        }

        Stack<Character> tmp = new Stack<>();
        while(!fstack.isEmpty()){
            tmp.add(fstack.pop());
        }

        while(!rstack.isEmpty()){
            sb.append(rstack.pop());
        }

        while(!tmp.isEmpty()){
            sb.append(tmp.pop());
        }

        if(sb.isEmpty()){
            System.out.println(0);
            System.exit(0);
        }

        System.out.println(sb);


    }
}
