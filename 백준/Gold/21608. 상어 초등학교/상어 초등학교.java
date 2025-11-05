import java.io.*;
import java.util.*;

public class Main {

    static int []vx = new int[]{1, 0, -1, 0};
    static int []vy = new int[]{0, -1, 0, 1};
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [][] arr = new int[N][N];
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < N * N; i++){
            st = new StringTokenizer(br.readLine());
            int []tmp = new int[5];
            for(int j = 0; j < 5; j++){
                tmp[j] = Integer.parseInt(st.nextToken());
            }
            list.add(tmp);
        }

        int [][][]visited = new int[N][N][N*N+1];

        for(int t = 0; t < N * N; t++) {
            int max = 0;
            int mx = -1;
            int my = -1;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 0 && visited[i][j][list.get(t)[0]] >= max && visited[i][j][list.get(t)[0]] > 0){
                        if(visited[i][j][list.get(t)[0]] == max){
                            int tt = 0;
                            for(int k = 0; k < 4; k++){
                                int dy = i + vy[k];
                                int dx = j + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < N && arr[dy][dx] == 0){
                                    tt += 1;
                                }
                            }

                            int tt2 = 0;
                            for(int k = 0; k < 4; k++){
                                int dy = my + vy[k];
                                int dx = mx + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < N && arr[dy][dx] == 0){
                                    tt2 += 1;
                                }
                            }

                            if(tt2 >= tt){
                                continue;
                            }
                            else{
                                my = i;
                                mx = j;
                            }
                        }
                        else {
                            max = visited[i][j][list.get(t)[0]];
                            mx = j;
                            my = i;
                        }

                    }
                }
            }
            if(max == 0){
                boolean isOk = false;
                int uy = -1;
                int ux = -1;
                int maxi = -1;
                for (int i = 0; i < N; i++) {
                    if(isOk) break;
                    for (int j = 0; j < N; j++) {
                        if(arr[i][j] == 0){
                            int tt = 0;
                            for(int k = 0; k < 4; k++){
                                int dy = i + vy[k];
                                int dx = j + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < N && arr[dy][dx] == 0){
                                    tt += 1;
                                }
                            }
                            if(tt == 4){
                                isOk = true;
                                maxi = tt;
                                uy = i;
                                ux = j;
                                break;
                            }
                            else{
                                if(tt > maxi){
                                    maxi = tt;
                                    uy = i;
                                    ux = j;
                                }
                            }
                        }
                    }
                }

                arr[uy][ux] = list.get(t)[0];
                for(int i = t + 1; i < N * N; i++){
                    for(int j = 1; j < 5; j++){
                        if(list.get(i)[j] == list.get(t)[0]){
                            for(int k = 0; k < 4; k++){
                                int dy = uy + vy[k];
                                int dx = ux + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < N){
                                    visited[dy][dx][list.get(i)[0]] += 1;
                                }
                            }
                        }
                    }
                }
            }
            else{
                arr[my][mx] = list.get(t)[0];
                for(int i = t + 1; i < N * N; i++){
                    for(int j = 1; j < 5; j++){
                        if(list.get(i)[j] == list.get(t)[0]){
                            for(int k = 0; k < 4; k++){
                                int dy = my + vy[k];
                                int dx = mx + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < N){
                                    visited[dy][dx][list.get(i)[0]] += 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        int res = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int tt = 0;
                for(int w = 0; w < N*N; w++){
                    if(list.get(w)[0] == arr[i][j]){
                        for(int k = 0; k < 4; k++){
                            int dy = i + vy[k];
                            int dx = j + vx[k];
                            if(0 <= dy && dy < N && 0 <= dx && dx < N){
                                for(int o = 1; o < 5; o++){
                                    if(list.get(w)[o] == arr[dy][dx]){
                                        tt += 1;
                                    }
                                }
                            }
                        }
                        if(tt == 1){
                            res += 1;
                        }
                        else if(tt == 2){
                            res += 10;
                        }
                        else if(tt == 3){
                            res += 100;
                        }
                        else if(tt == 4){
                            res += 1000;
                        }
                    }
                }

            }
        }
        System.out.println(res);

        





    }
}
