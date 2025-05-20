

import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []time = new int[N];
		int []code = new int[N];
		
		for(int i = 0; i < N; i++) {
			time[i] = scanner.nextInt();
			code[i] = scanner.nextInt();
		}
		int maxi = Arrays.stream(time).max().getAsInt();
		int mini = Arrays.stream(code).min().getAsInt();
		
		int tmp = maxi * mini % 7;
		System.out.println(tmp+1);
		
	}
}


