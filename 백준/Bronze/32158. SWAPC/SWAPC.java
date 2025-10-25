import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char []s = new char[n];
        String ss = br.readLine();
        for(int i = 0; i < n; i++){
            s[i] = ss.charAt(i);
        }

        Deque<Integer> pqueue = new ArrayDeque<>();
        Deque<Integer> cqueue = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            if(s[i] == 'P') pqueue.add(i);
            else if(s[i] == 'C') cqueue.add(i);
        }

        while(!pqueue.isEmpty() && !cqueue.isEmpty()){
            int i = pqueue.pollFirst();
            int j = cqueue.pollFirst();
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }


        for(int i = 0; i < n; i++){
            System.out.print(s[i]);
        }




    }
}
