import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static int res = 0;
    static int [][]no;
    static int N;
    static int M;
    static void recur(int nums, int []li, int max){
        if(nums == 3) {
            res += 1;
            return;
        }
        for(int i = max + 1; i <= N; i++){
            if(li[0] == i || li[1] == i || li[2] == i){
                continue;
            }
            if(no[li[0]][i] == 1 || no[li[1]][i] == 1 || no[li[2]][i] == 1){
                continue;
            }
            li[nums] = i;
            recur(nums+1, li, i);
            li[nums] = 0;
        }

    }

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        no = new int[N+1][N+1];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            no[a][b] = 1;
            no[b][a] = 1;
        }
        int []li = new int[3];
        recur(0, li, 0);
        System.out.println(res);



    }

}

