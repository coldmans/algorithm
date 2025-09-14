import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][]graph = new int[n][n];
        int gy = -1;
        int gx = -1;
        int hy = -1;
        int hx = -1;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                int t = Integer.parseInt(st.nextToken());
                graph[i][j] = t;
                if(t == 5){
                    gy = i;
                    gx = j;
                }
                else if(t == 2){
                    hy = i;
                    hx = j;
                }
            }
        }

        if(Math.pow(hy-gy , 2) + Math.pow(hx-gx, 2) < 25){
            System.out.println(0);
            System.exit(0);
        }
        else{
            int miny = Math.min(hy, gy);
            int maxy = -1;
            if(miny == hy){
                maxy = gy;
            }
            else{
                maxy= hy;
            }

            int minx = Math.min(hx, gx);
            int maxx = -1;
            if(minx == hx){
                maxx = gx;
            }
            else{
                maxx= hx;
            }
            int res = 0;
            for(int i = miny; i <= maxy; i++){
                for(int j = minx; j <= maxx; j++){
                    if(graph[i][j] == 1){
                        res += 1;
                    }
                }
            }
            if(res >= 3){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }


        }

    }

}