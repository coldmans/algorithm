
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
		int N = scanner.nextInt();
		int cnt = 0;
		while(cnt < N) {
			int a = scanner.nextInt();
			if(a == 0) {
				if(priorityQueueHighest.size() == 0) {
					System.out.println(-1);
				}
				else {
					System.out.println(priorityQueueHighest.poll());
				}
			}
			else {
				for(int i = 0; i < a; i++) {
					int x = scanner.nextInt();
					priorityQueueHighest.add(x);
				}
			}
			cnt ++;
		}
		
	}
	
}


