
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		long[][] g = new long[N][M];
		int [][] color = new int[N][M];
		
		long [][][]dp = new long[N][M][2];
		
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < M; j++){
		        g[i][j] = scanner.nextLong();
		    }
		}
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < M; j++){
		        color[i][j] = scanner.nextInt();  // 0 또는 1
		    }
		}

		
		dp[0][0][0] = g[0][0];
		
		for(int i = 1; i < M; i++) {
			int t;
			if(color[0][i] == 0) {
				t = 1; 
			}
			else {
				t = -1;
			}
			dp[0][i][0] = (dp[0][i-1][0] + g[0][i]) * t;
			dp[0][i][1] = (dp[0][i-1][0] + g[0][i]) * t;
		}
		for(int i = 1; i < N; i++) {
			int t;
			if(color[i][0] == 0) {
				t = 1; 
			}
			else {
				t = -1;
			}
			dp[i][0][0] = (dp[i-1][0][0] + g[i][0]) * t;
			dp[i][0][1] = (dp[i-1][0][0] + g[i][0]) * t;
		}
		
		for(int i = 1; i < N; i++) {
			for(int j = 1; j < M; j++) {
				long []tmp = new long[4];
				tmp[0] = dp[i-1][j][0];
				tmp[1] = dp[i-1][j][1];
				tmp[2] = dp[i][j-1][0];
				tmp[3] = dp[i][j-1][1];
				long maxi = Long.MIN_VALUE;
				long mini = Long.MAX_VALUE;
				for(int k = 0; k < 4; k++) {
					if(tmp[k] > maxi ) {
						maxi = tmp[k];
					}
					if(tmp[k] < mini) {
						mini = tmp[k];
					}
				}
				if(color[i][j] == 0) {
					dp[i][j][1] = maxi + g[i][j];
					dp[i][j][0] = mini + g[i][j];
				}
				else {
					dp[i][j][0] = (mini + g[i][j]) * -1;
					dp[i][j][1] = (maxi + g[i][j]) * -1;
				}
			}
		}
		if(dp[N-1][M-1][1] > dp[N-1][M-1][0]) {
			System.out.println(dp[N-1][M-1][1]);
		}
		else {
			System.out.println(dp[N-1][M-1][0]);
		}
	}
	
}













