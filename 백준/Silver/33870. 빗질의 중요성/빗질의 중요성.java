

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [] jugi = new int[N];
		int [] dog = new int[M];
		int [] tmp = new int[N];
		for(int i = 0; i < N; i++) {
			jugi[i] = scanner.nextInt();
		}
		for(int i = 0; i < M; i++) {
			dog[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				tmp[j] += 1;
				if(tmp[j] > jugi[j]) {
					tmp[j] -= 1000000;
				}
			}
			if(tmp[dog[i]-1] >= 0)
			tmp[dog[i]-1] = 0;
			else {
				if(i > 0 && (dog[i] == dog[i-1])) {
					tmp[dog[i]-1] = 0;
				}
			}
		}
		
		for(int j = 0; j < N; j++) {
			tmp[j] += 1;
			if(tmp[j] > jugi[j]) {
				tmp[j] -= 1000000;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(tmp[i] < 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		
	}
}


