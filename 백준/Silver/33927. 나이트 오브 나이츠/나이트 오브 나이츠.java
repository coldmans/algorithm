
import java.util.Scanner;

import java.util.ArrayList;
public class Main {
	static int N;
	static int ans;
	static void recur(int i, int j, int [][] g, int [][]v, int w) {
		 int [] is = {2,2, 1, -1, -2, -2, -1, 1};
		 int [] js = {-1, 1, 2, 2, 1, -1, -2, -2};
		
		if(i == N) {
			ans = Math.max(ans,  w);
			return;
		}
		
			int wax = 1;
			for(int k = 0; k <8; k++) {
				int ti = i + is[k];
				int tj = j + js[k];
				if(0 <= ti && ti < N && 0 <= tj && tj < N) {
					if(v[ti][tj] == 1) {
						wax = 0;
					}
				}
			}
			if(wax == 1) {
				v[i][j] = 1;
				
				if(j + 1 == N)
				recur(i+1, 0, g, v, w +g[i][j]);
				else
					recur(i,j+1,g,v,w +g[i][j]);
				
				v[i][j] = 0;
			}
			if(j + 1 == N)
			recur(i+1, 0, g, v, w);
			else
				recur(i,j+1,g,v,w);
		
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int [][] g = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				g[i][j] = scanner.nextInt();
			}
		}
		int [][]v = new int[N][N];
		recur(0, 0, g, v, 0);
		System.out.println(ans);

	}
	
}













