

import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int c = scanner.nextInt();
		int p = scanner.nextInt();
		
		int day = (n-1) / t;
		int price = day * c * p;
		System.out.println(price);
		
	}
}
