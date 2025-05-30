
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = 0;
		long B = 0;
		long C = 0;
		long D = 0;
		for(int i = 0; i < N; i++) {
			A += sc.nextLong();
			B += sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			C += sc.nextLong();
			D += sc.nextLong();
		}
		
		C -= A;
		D -= B;

		System.out.println((C / N) + " " + (D / N));
	}	
}









