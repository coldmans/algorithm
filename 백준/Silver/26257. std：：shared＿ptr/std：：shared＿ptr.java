import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int []arr = new int[M+1];
        for(int i = 1; i <= M; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < Q; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("assign")){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a] = arr[b];
            }
            else if(s.equals("swap")){
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int t = arr[a];
                arr[a] = arr[b];
                arr[b] = t;
            }
            else{
                int a = Integer.parseInt(st.nextToken());
                arr[a] = 0;
            }
        }

        TreeSet<Integer> resultSet = new TreeSet<>();
        for (int i = 1; i <= M; i++) {
            if (arr[i] != 0) {
                resultSet.add(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(resultSet.size()).append("\n");
        for (int val : resultSet) {
            sb.append(val).append("\n");
        }
        System.out.print(sb);



    }
}