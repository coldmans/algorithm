import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        while(true){
            int x = Integer.parseInt(st.nextToken());
            if(x == 0) break;
            list.add(x);
        }

        int l = list.size();
        int [][][]dp = new int[l+1][5][5];
        for(int i = 0; i <= l; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    dp[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }

        dp[0][0][0] = 1;
        dp[1][0][list.get(0)] = 2;
        dp[1][list.get(0)][0] = 2;


        for(int i = 1; i < l; i++){
            for(int j = 0; j <= 4; j++){
                for(int k = 0; k <= 4; k++){
                    if(dp[i][j][k] == Integer.MAX_VALUE) continue;
                    if(dp[i][j][k] > 0){
                        if(k == 0){
                            dp[i+1][j][list.get(i)] = Math.min(dp[i+1][j][list.get(i)], dp[i][j][k] + 2);
                        }
                        else if(list.get(i) - k == 2 || list.get(i) - k == -2){
                            dp[i+1][j][list.get(i)] = Math.min(dp[i][j][k] + 4, dp[i+1][j][list.get(i)]);
                        }
                        else if(list.get(i) != k){
                            dp[i+1][j][list.get(i)] = Math.min(dp[i+1][j][list.get(i)], dp[i][j][k] + 3);
                        }
                        else if(list.get(i) == k){
                            dp[i+1][j][k] = Math.min(dp[i+1][j][k], dp[i][j][k] + 1);
                        }


                        if(j == 0){
                            dp[i+1][list.get(i)][k] = Math.min(dp[i+1][list.get(i)][k], dp[i][j][k] + 2);
                        }
                        else if(list.get(i) - j == 2 || list.get(i) - j == -2){
                            dp[i+1][list.get(i)][k] = Math.min(dp[i+1][list.get(i)][k], dp[i][j][k] + 4);
                        }
                        else if(list.get(i) != j){
                            dp[i+1][list.get(i)][k] = Math.min(dp[i+1][list.get(i)][k], dp[i][j][k] + 3);
                        }
                        else if(list.get(i) == j){
                            dp[i+1][j][k] = Math.min(dp[i+1][j][k], dp[i][j][k] + 1);
                        }

                    }
                }
            }
        }



        int small = Integer.MAX_VALUE;
        int x = list.size()-1;

        for(int i = 0; i <= 4; i++){
            small = Math.min(small, dp[l][i][list.get(x)]);
            small = Math.min(small, dp[l][list.get(x)][i]);
        }

        System.out.println(small);

    }
}
