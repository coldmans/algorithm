import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int [][]graph = new int[n][5];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                int t = Integer.parseInt(st.nextToken());
                graph[i][j] = t;
            }
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                for(int k = j+1; k < 5; k++){
                    if(graph[i][j] + graph[i][k] == 2){
                        int tmp = (int) (Math.pow(j,2) + Math.pow(k,2));
                        hashMap.put(tmp, hashMap.getOrDefault(tmp,0) + 1);
                    }
                }
            }
        }

        int maxi = 0;
        int r = 0;

        if(hashMap.keySet().size() < 1){
            System.out.println(0);
            System.out.println("1 1 0 0 0");
            System.exit(0);
        }

        for (Integer i : hashMap.keySet()) {
            if(hashMap.get(i) > maxi){
                maxi = hashMap.get(i);
                r = i;
            }
        }


        System.out.println(maxi);
        int g[] = new int[5];
        int p = 0;
        for(int i = 4; i >= 0; i--){
            if(p >= 2) break;
            if(r >= i * i){
                r -= i * i;
                g[i] = 1;
                p += 1;
            }
        }

        for (int i : g) {
            System.out.print(i + " ");
        }


    }
}