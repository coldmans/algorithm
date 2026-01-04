import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new PriorityQueue<>();
        List<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            queue.clear();
            sb.append((M+1)/2  + "\n");
            int ctt = 0;
            for(int j = 1; j <= M; j++){
                if(j > 1 && (j-1) % 10 == 0){
                    st = new StringTokenizer(br.readLine());
                }
                if(ctt == 10){
                    sb.append("\n");
                    ctt = 0;
                }
                queue.add(Integer.parseInt(st.nextToken()));
                if(j % 2 == 1){
                    int u = 0;
                    tmp.clear();
                    for(int k = 0; k < (j+1) / 2; k++){
                        u = queue.remove();
                        tmp.add(u);
                    }
                    sb.append(u+ " ");

                    for(int k = 0; k < (j + 1) / 2; k++){
                        queue.add(tmp.get(k));
                    }
                    ctt += 1;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}