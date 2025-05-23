
import java.util.Scanner;


public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int K = scanner.nextInt();
		String s = scanner.next();
		int tmp;
		if(M == 1) {
			tmp = N + N -1;
		}
		else {
			tmp = 2 * N;
		}
		
		
		for(int i = 0; i < K; i++) {
			if(s.charAt(i) == 'A') {
				if(tmp <= 4) {
					tmp += 4;
				}
				else {
					tmp -= 4;
				}
			}
			else if(s.charAt(i) == 'B') {
				if(tmp == 1 || tmp == 5) {
					tmp += 3;
				}
				else if(tmp == 2 || tmp == 6) {
					tmp += 1;
				}
				else if(tmp == 3 || tmp == 7) {
					tmp -= 1;
				}
				else if(tmp == 4 || tmp ==8 ) {
					tmp -= 3;
				}
			}
			else if(s.charAt(i) == 'C') {
				if(tmp == 1) {
					tmp = 8;
				}
				else if(tmp == 8) {
					tmp = 1;
				}
				else if(tmp == 2) {
					tmp = 7;
				}
				else if(tmp == 7) {
					tmp = 2;
				}
				else if(tmp == 3) {
					tmp = 6;
				}
				else if(tmp == 6) {
					tmp = 3;
				}
				else if(tmp == 4) {
					tmp = 5;
				}
				else if(tmp == 5) {
					tmp = 4;
				}
			}
			else {
				if(tmp == 1) {
					tmp = 2;
				}
				else if(tmp % 2 == 0) {
					tmp += 2;
					if(tmp == 10) {
						tmp = 7;
					}
				}
				else {
					tmp -= 2;
				}
			}
		}
		
		if(tmp % 2 == 0) {
			System.out.print((tmp / 2) + " ");
			System.out.println(2);
		}
		else {
			System.out.print(((tmp+1)/2) + " ");
			System.out.println(1);
		}
		
		
		
		
		
	}
	
}













