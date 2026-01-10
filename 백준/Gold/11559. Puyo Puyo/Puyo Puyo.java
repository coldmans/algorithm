import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int [] dy = {-1, 0, 0, 1};
    static int [] dx = {0, -1, 1, 0};
    static List<int[]> list;
    static boolean [][] visited;
    static void dfs(int i, int j, Character [][]g){
        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            int di = i + dy[k];
            int dj = j + dx[k];
            if(0 <= di && di < 12 && 0 <= dj && dj < 6 && g[i][j] == g[di][dj] &&!visited[di][dj]){
                list.add(new int[]{di, dj});
                dfs(di, dj, g);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] g = new Character[12][6];
        for(int i = 0; i < 12; i ++){
            String s = br.readLine();
            for(int j = 0; j < 6; j++){
                g[i][j] = s.charAt(j);
            }
        }


        list = new ArrayList<>();
        int ctt = 0;
        while(true) {
            boolean isBoom = false;
            visited = new boolean[12][6];

            for (int i = 11; i >= 0; i--) {
                
                for (int j = 0; j < 6; j++) {
                    if (g[i][j] != '.') {
                        
                        list.add(new int[]{i, j});
                        dfs(i,j,g);
                        if(list.size() >= 4){
                            for(int k = 0; k < list.size(); k++) {
                                int[] tmp = list.get(k);
                                g[tmp[0]][tmp[1]] = '.';
                                isBoom = true;
                            }

                        }
                        list.clear();
                    }
                }
               
            }
            if(!isBoom){
                break;
            }
            else{
                for(int k = 0; k < 6; k++){
                    Queue<Character> queue = new ArrayDeque<>();
                    for(int p = 11; p >= 0; p--){
                        if(g[p][k] != '.'){
                            queue.add(g[p][k]);
                        }
                    }
                    for(int p = 11; p >= 0; p--){
                        if(!queue.isEmpty()){
                            g[p][k] = queue.poll();
                        }
                        else{
                            g[p][k] = '.';
                        }
                    }
                }
                ctt += 1;
            }
        }



        System.out.println(ctt);

    }
}