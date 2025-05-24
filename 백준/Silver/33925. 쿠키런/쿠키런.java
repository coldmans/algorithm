
import java.util.Scanner;

import java.util.ArrayList;
public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int J = scanner.nextInt();
		int S = scanner.nextInt();
		int H = scanner.nextInt();
		int K = scanner.nextInt();
		
		String up = scanner.next();
		String middle = scanner.next();
		String down = scanner.next();
		
		int uu = 0;
		int u = 0;
		int d = 0;
		
		for(int i = 0; i < up.length(); i++) {
			if(up.charAt(i) == 'v') {
				d += 1;
			}
			else if(middle.charAt(i) == '^') {
				uu += 1;
			}
			else if(down.charAt(i) == '^') {
				u += 1;
			}
		}
		
		d -= S;
		if(d < 0) {
			d = 0;
		}
		H -= (d * K);
		
		if(u < J) {
			J -= u;
			uu -= J/2;
			if(uu < 0) {
				uu = 0;
			}
			while(uu > 0) {
				uu -= 1;
				H -= K;
			}
		}
		else {
			u -= J;
			H -= (u * K);
			while(uu > 0) {
				uu -= 1;
				H -= K;
			}
		}
		


		if(H <= 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(H);
		}
		
	}
	
}













