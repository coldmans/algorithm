

import java.util.Scanner;

public class Main {
	static int N;
	static int E;
	static int [][] graph;
	static int maxi = -1;
	static int []mae;
	
	public static void recur(int[] banana, int a, int p, int tmp, int[] visited) {
		visited[a] += 1;
		
		if(visited[a] == 1) {
			tmp += banana[a];
		}
		if(p == 0) {
			if(a == E) {
				maxi = Math.max(maxi, tmp);
			}
			visited[a] -= 1;
			return;
		}
		for(int i = 0; i < N; i++) {
			if (graph[a][i] == 1 && visited[i] < 2 && mae[i] == 0) {
				recur(banana, i, p-1, tmp, visited);
			}
		}
		visited[a] -= 1;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int H = scanner.nextInt();
		int S = scanner.nextInt()-1;
		E = scanner.nextInt()-1;
		
		int [] banana = new int[N];
		int [] visited = new int[N];
		graph = new int[N][N];
		mae = new int[N];
		for(int i = 0; i < N; i++) {
			banana[i] = scanner.nextInt();
		}

		for(int i = 0; i < N; i++) {
			mae[i] = scanner.nextInt();
		}
		for(int i = 0; i < N -1; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			graph[a-1][b-1] = 1;
			graph[b-1][a-1] = 1;
		}
		
		recur(banana, S, H, 0, visited);
		System.out.println(maxi);
	}
}


