
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [][]li = new int[N][M];
		int [][]mel;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				li[i][j] = scanner.nextInt();
			}
		}
		
		boolean [][]v;
		int []xd = {-1, 0 , 1, 0};
		int []yd = {0 , 1, 0, -1};
		
		v = new boolean[N][M];
		int realTime = 0;
		while(true) {
			int group = 0;
			realTime += 1;
			v = new boolean[N][M];
			mel = new int[N][M];
			Queue<int[]> q = new LinkedList<>();
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					if(li[i][j] > 0 && v[i][j] == false) { 
						group++;                         
						q.add(new int[] {i, j});
						v[i][j] = true;                 
						while(!q.isEmpty()) {
							int t[] =  q.poll();
							int y = t[0];
							int x = t[1];
							int sz = 0;
							for(int a = 0; a < 4; a++) {
								int dy = y + yd[a];
								int dx = x + xd[a];
								if(0<= dy && dy < N && 0 <= dx && dx < M) {
									if(li[dy][dx] == 0) {
										sz += 1;
									}
									else if(li[dy][dx] >= 1 && v[dy][dx] == false) {
										q.add(new int[] {dy, dx});
										v[dy][dx] = true;
									}
								}
							}
							if(li[y][x] <= sz) {
								mel[y][x] = 0;
							}
							else {
								mel[y][x] = li[y][x] - sz;
							}
						}
					}
				}
			}
			
			if(group >= 2) {
				System.out.println(realTime - 1);
				break;
			}

			boolean waxi = false;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < M; j++) {
					li[i][j] = mel[i][j];
					if(mel[i][j] >= 1) {
						waxi = true;
					}
				}
			}
			if(waxi == false) {
				System.out.println(0);
				break;
			}
		}
	}
}
