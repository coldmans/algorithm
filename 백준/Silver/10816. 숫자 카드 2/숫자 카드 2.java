import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> hash = new HashMap<>();
		int N = scanner.nextInt();
		for(int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			if(hash.containsKey(x)) {
				int t = hash.get(x);
				hash.put(x, t+1);
			}
			else {
				hash.put(x, 1);
			}
		}
        int M = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = scanner.nextInt();
            sb.append(hash.getOrDefault(target, 0)).append(" ");
        }

        System.out.println(sb.toString());
		
		
	}
	
}


