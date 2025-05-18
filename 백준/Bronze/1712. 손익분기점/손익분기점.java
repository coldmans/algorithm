

import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(c > b) {
			int temp = 1;
			while(a >= (c-b) * temp) {
				temp += 1;
			}
			System.out.println(temp);
		}
		else {
			System.out.println(-1);
		}
		
	}
}
