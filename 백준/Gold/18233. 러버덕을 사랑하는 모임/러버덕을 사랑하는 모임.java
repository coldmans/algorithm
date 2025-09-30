import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;
    static int P;
    static int E;
    static int N;

    static void choice(int min, int max, List<Integer> idx, List<int[]> list, int i){
        if(idx.size() == P){
            if(min <= E && E <= max) {
                int[] arr = new int[N];
                for(int j = 0; j < idx.size(); j++){
                    arr[idx.get(j)] = list.get(idx.get(j))[0];
                }
                int tmp = 0;
                while(min + tmp < E) {
                    for (int j = 0; j < idx.size(); j++) {
                        if (min + tmp == E) break;
                        if(arr[idx.get(j)] == list.get(idx.get(j))[1]){
                            continue;
                        }
                        arr[idx.get(j)] += 1;
                        tmp++;
                    }
                }
                for (Integer integer : arr) {
                    System.out.print(integer + " ");
                }
                System.exit(0);
            }
            return;
        }
        if(i >= N){
            return;
        }
 
        idx.add(i);
        choice(min + list.get(i)[0], max + list.get(i)[1], idx, list, i+1);
        idx.remove(idx.size()-1);
        choice(min , max , idx, list, i+1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new int[]{x,y});
        }
        if(N < P){
            System.out.println(-1);
            System.exit(0);
        }

        List<Integer> idx = new ArrayList<>();
        choice(0,0,idx,list,0);
        System.out.println(-1);



    }
}

