import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> crane = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int []ct = new int[N];
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            crane.add(tmp);
        }
        st = new StringTokenizer(br.readLine());
        Collections.sort(crane);
        int M = Integer.parseInt(st.nextToken());
        List<Integer> box = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            box.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(box);
        int i = 0;
        int j = 0;
        while(i < N && j < M){
            if(crane.get(i) >= box.get(j)){
                ct[i] += 1;
                j += 1;
            }
            else{
                i += 1;
            }
        }
        if(j < M){
            System.out.println(-1);
            System.exit(0);
        }

        int init = M;
        int k = 0;

        while(k < N-1){
            if((init / (N-k)) <= ct[k] -1){
                ct[k] -= 1;
                ct[k+1] += 1;
            }
            else{
                init -= ct[k];
                k += 1;
            }
        }

        int max = 0;
        for (int i1 : ct) {
            max = Math.max(max, i1);

        }
        System.out.println(max);


    }
}