
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static int N, M, V;
	static ArrayList<Integer>[] adj;
	static boolean[] visited;
	static StringBuilder dfsSb = new StringBuilder();
	static StringBuilder bfsSb = new StringBuilder();
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		adj = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			adj[i] = new ArrayList<>();
		}
		for(int i = 1; i <= M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(adj[i]);
		}
		
		visited = new boolean[N + 1];
		dfs(V);
		System.out.println(dfsSb.toString().trim());
		
		visited = new boolean[N + 1];
		bfs(V);
		System.out.println(bfsSb.toString().trim());

	}
	
	static void dfs(int u) {
		visited[u] = true;
		dfsSb.append(u).append(' ');
		for(int v : adj[u]) {
			if(!visited[v]) {
				dfs(v);
			}
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int u = q.poll();
			bfsSb.append(u).append(' ');
			for(int v : adj[u]) {
				if(!visited[v]) {
					visited[v] = true;
					q.add(v);
				}
			}
			
		}
		
	}
	
}













