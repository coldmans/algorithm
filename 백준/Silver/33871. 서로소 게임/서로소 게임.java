

import java.util.Scanner;

public class Main {
	public static int gcd(int a, int  b) {
		
		while(a != 0) {
			int tmp = a;
			a = b % a;
			b = tmp;
		}
		return b;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int cnt = 0;
		while(true) {
			int tmp = cnt;
			for(int i = 2; i < N; i++) {
				if(gcd(N,i) == 1) {
					N = i;
					cnt ++;
					break;
				}
			}
			if(tmp == cnt) break;
		}
		if(cnt % 2 == 0) {
			System.out.println("Song");
		}
		else {
			System.out.println("Soomin");
		}
	}
}


