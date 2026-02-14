import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int []dy = {1, 0, -1, 0};
    static int []dx = {0, -1, 0, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        Character [][]graph = new Character[2*p+1][2*p+1];
        for(int i = 0; i < 2*p+1; i++){
            for(int j = 0; j < 2*p+1; j++){
                graph[i][j] = '#';
            }
        }
        int py = p;
        int px = p;
        graph[py][px] = '.';
        int dir = 0;
        String s = br.readLine();
        for(int i = 0; i < p; i++){
            if(s.charAt(i) == 'F'){
                py += dy[dir];
                px += dx[dir];
                graph[py][px] = '.';
            }
            else if(s.charAt(i) == 'R'){
                dir += 1;
                if(dir == 4){
                    dir = 0;
                }
            }
            else if(s.charAt(i) == 'L'){
                dir -= 1;
                if(dir == -1){
                    dir = 3;
                }
            }
        }

        int maxR = -1;
        int minR = Integer.MAX_VALUE;

        int minH = Integer.MAX_VALUE;
        int maxH = -1;

        for(int i = 0; i < 2*p+1; i++){
            for(int j = 0; j < 2*p+1; j++){
                if(graph[i][j] == '.'){
                    maxR = Math.max(j, maxR);
                    minR = Math.min(j, minR);
                    maxH = Math.max(i, maxH);
                    minH = Math.min(i, minH);
                }
            }
        }

        for(int i = minH; i <= maxH; i++){
            for(int j = minR; j <= maxR; j++){
                if(graph[i][j] != '.'){
                    System.out.print('#');
                }
                else{
                    System.out.print('.');
                }
            }
            System.out.println();
        }




    }
}
