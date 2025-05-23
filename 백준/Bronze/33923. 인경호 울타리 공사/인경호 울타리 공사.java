
import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		if(N != M) {
			if(N < M) {
				System.out.println((N-1) * (N-1));
			}
			else {
				System.out.println((M-1) * (M-1));
			}
		}
		else {
			System.out.println((N-2) * (N-2) + 1);
		}
		
		
	}
	
}













