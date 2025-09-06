import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int []dy = {0, -1, 0, 1};
    static int []dx = {1, 0, -1, 0};

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int dir = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("MOVE")){
                int tmp = Integer.parseInt(st.nextToken());
                x = dx[dir] * tmp + x;
                y = dy[dir] * tmp + y;
                if(0 > x || x >= M || 0 > y || y >= M){

                    System.out.println(-1);
                    System.exit(0);
                }
            }
            else{
                int dire = Integer.parseInt(st.nextToken());
                if(dire == 1){
                    dir += 1;
                    if(dir == 4){
                        dir = 0;
                    }
                }
                else{
                    dir -= 1;
                    if(dir == -1){
                        dir = 3;
                    }
                }
            }
        }
        System.out.print(x + " " + y);
    }
}



