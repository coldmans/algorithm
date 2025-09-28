import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    static int []p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        p = new int[N+1];

        for(int i = 0; i <= N; i++){
            p[i] = i;
        }
        int res = 0;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int t = findNode(u);
            int l = findNode(v);

            if(t == l){
                res ++;
            }
            else{
                if(t <= l){
                    p[l] = t;
                }
                else{
                    p[t] = l;
                }
            }
        }

        for(int i = 1; i <= N; i++){
            p[i] = findNode(i);
        }

        Set<Integer> set = new HashSet<>();
        set.add(p[1]);
        for(int i = 2; i <= N; i++){
            if(!set.contains(p[i])){
                set.add(p[i]);
                res ++;
            }
        }


        System.out.println(res);

    }
    static int findNode(int v){
        if(p[v] == v){
            return v;
        }
        return findNode(p[v]);
    }


}

