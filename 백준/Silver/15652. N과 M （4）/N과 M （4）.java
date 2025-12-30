import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static int M;
    static StringBuilder sb;

    public static void recur(List<Integer> list){
        if(list.size() == M){
            for (Integer i : list) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        else{
            for(int i = 1; i <= N; i++){
                if(list.size() > 0 && list.get(list.size() - 1) > i) continue;
                list.add(i);
                recur(list);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        recur(new ArrayList<>());
        System.out.println(sb);



    }
}