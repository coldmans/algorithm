

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []li = new int[N];
		for(int i = 0; i < N; i++) {
			li[i] = scanner.nextInt();
		}
		Arrays.sort(li);
		for(int i = 0; i < N; i++) {
			System.out.println(li[i]);
		}
	}
}
