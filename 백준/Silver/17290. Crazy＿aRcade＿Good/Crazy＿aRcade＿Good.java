import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int []dy = {1, 0, -1, 0};
    static int []dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0])-1;
        int M = Integer.parseInt(input[1])-1;

        int [][]wax = new int[10][10];
        boolean [][]visited = new boolean[10][10];
        for(int i = 0; i < 10; i++){
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'o'){
                    for(int k = 0; k < 10; k++){
                        wax[k][j] = wax[i][k] = 1;
                    }
                }
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {N,M,0});
        visited[N][M] = true;
        while(!queue.isEmpty()){
            int[]d = queue.poll();
            int y = d[0];
            int x = d[1];
            int tmp = d[2];

            if(wax[y][x] == 0){
                System.out.println(tmp);
                break;
            }

            for(int i = 0; i < 4; i++){
                int ey = y + dy[i];
                int ex = x + dx[i];

                if(0 <= ey && ey < 10 && 0 <= ex && ex < 10 && visited[ey][ex] == false){
                    visited[ey][ex] = true;
                    queue.add(new int[]{ey,ex,tmp+1});
                }
            }

        }


    }
}


