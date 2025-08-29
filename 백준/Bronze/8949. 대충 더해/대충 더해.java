import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int i = 0;
        if(A.length() > B.length()){
            i = A.length() - B.length();
        }
        else{
            String C = A;
            A = B;
            B = C;
            i = A.length() - B.length();
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for(int x = 0; x < i; x++){
            queue.add(Integer.parseInt(String.valueOf(A.charAt(x))));
        }

        for(int j = 0; j < B.length(); j++){
            queue.add(Integer.parseInt(String.valueOf(A.charAt(j+i))) + Integer.parseInt(String.valueOf(B.charAt(j))));
        }

        while(!queue.isEmpty()){
            System.out.print(queue.poll());
        }




    }
}

