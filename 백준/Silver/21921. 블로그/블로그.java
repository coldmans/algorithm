

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int [] bang = new int[n];
		for(int i = 0; i < n; i++) {
			bang[i] = scanner.nextInt();
		}
		int []window = new int[n+1];
		int t = 0;
		for(int i = 0; i < x; i++) {
			t += bang[i];
		}
		window[x-1] = t;
		
		for(int i = x; i < n; i++) {
			window[i] = window[i-1] - bang[i-x] + bang[i];
		}
		int tmp = 0;
		int maxi = Arrays.stream(window).max().getAsInt();
		for(int i = 0; i < n; i++) {
			if (window[i] == maxi) {
				tmp ++;
			}
		}
		if(maxi == 0) {
			System.out.println("SAD");
		}
		else {
			System.out.println(maxi);
			System.out.println(tmp);
		}
	}
}


