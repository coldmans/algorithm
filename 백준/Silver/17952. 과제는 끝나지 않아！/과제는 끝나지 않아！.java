

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Stack<int[]> stack = new Stack<>();
		int []at = new int[2];
		int tmp = 0;
		for(int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			if(x == 1) {
				if(at[1] > 0) {
					stack.push(new int[] {at[0], at[1]});
				}
				at[0] = scanner.nextInt();
				at[1] = scanner.nextInt() - 1;
			}
			else {
				if(stack.size() > 0 && at[1] <= 0) {
					at = stack.pop();
				}
				at[1] -= 1;
			}
			if(at[1] == 0) {
				tmp += at[0];
			}
		}
		System.out.println(tmp);
		
	}
}


