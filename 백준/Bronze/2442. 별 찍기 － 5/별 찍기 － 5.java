
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = N-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		

	}

}

