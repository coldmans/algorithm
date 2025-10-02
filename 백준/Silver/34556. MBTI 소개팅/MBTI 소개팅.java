import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static String []man;
    static int []vman;
    static int []vgirl;
    static String []girl;
    static int max = 0;
    static int N;

    static void recur(int res, int p, int l){
        if(p == N){
            max = Math.max(max, res);
            return;
        }
        for(int u = 0; u < N; u++){
            if(vman[l] == 0 && vgirl[u] == 0){
                vman[l] = 1;
                vgirl[u] = 1;
                int t = 0;
                for(int k = 0; k < 4; k++){
                    if(man[l].charAt(k) != girl[u].charAt(k)){
                        t += 1;
                    }
                }
                recur(res + t, p+1, l+1);
                vman[l] = 0;
                vgirl[u] = 0;
            }
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        man = new String[N];
        girl = new String[N];
        for(int i = 0; i < N; i++){
            man[i] = br.readLine();
        }
        for(int i = 0; i < N; i++) {
            girl[i] = br.readLine();
        }

        vman = new int[N];
        vgirl = new int[N];
        recur(0,0,0);

        System.out.println(max);


    }

}
