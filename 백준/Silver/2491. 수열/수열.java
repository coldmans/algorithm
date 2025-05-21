

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []arr = new int[N];
		int maxi = 0;
		int mini = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		int tmp = 1;
		for(int i = 1; i < N; i++) {
			if(arr[i] - arr[i-1] >= 0) {
				tmp += 1;
			}
			else {
				maxi = Math.max(maxi, tmp);
				tmp = 1;
			}
		}
		maxi = Math.max(maxi, tmp);
		
		tmp = 1;
		for(int i = 1; i < N; i++) {
			if(arr[i] - arr[i-1] <= 0) {
				tmp += 1;
			}
			else {
				mini = Math.max(mini, tmp);
				tmp = 1;
			}
		}
		mini = Math.max(mini, tmp);
		
		System.out.println(Math.max(maxi,mini));
	}
	
}


