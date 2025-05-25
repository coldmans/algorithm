
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
	static int [] imove = {-1, 0, 0, 1};
	static int [] jmove = {0, 1, -1, 0};
	static int [][]g;
	static int N;
	static int M;
	static int [][] v;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		g = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String what = sc.next();
			for(int j = 0; j < M; j++) {
				g[i][j] = what.charAt(j) - '0';
			}
		}
		v = new int[N][M];
		
		System.out.println(bfs(0,0));

		
		



	}
	static int bfs(int i, int j) {
		int [][] dist = new int[N][M];
		Queue<int[]> q = new LinkedList<>();
		v[i][j] = 1;
		q.add(new int[] {i,j});
		dist[i][j] = 1;

		while(!q.isEmpty()) {
			int [] cur = q.poll();
			i = cur[0];
			j = cur[1];
			
			if(i == N-1 && j == M-1) {
				return dist[i][j];
			}
			for(int k = 0; k < 4; k++) {
				int ki = imove[k] + i;
				int kj = jmove[k] + j;
				if(0 <= ki && ki < N && 0 <= kj && kj < M && v[ki][kj] == 0 && g[ki][kj] == 1) {
					q.add(new int[] {ki, kj});
					v[ki][kj] = 1;
					dist[ki][kj] = dist[i][j] + 1;
				}
			}
		}
		return -1;
		
	}
	

	
}













