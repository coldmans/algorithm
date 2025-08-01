import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        for(int i = 0; i < TestCase; i++){
            int N = sc.nextInt();
            int []player = new int[N+1];
            boolean end = false;

            for(int j = 1; j <= N; j++){
                player[j] = sc.nextInt();
            }

            Queue<int []> queue = new ArrayDeque<>();
            boolean []visited = new boolean[N+1];
            visited[1] = true;
            queue.add(new int[]{1,0});
            while(!queue.isEmpty()){
                int []wax = queue.poll();
                int target = wax[0];
                int res = wax[1];

                if(target == N){
                    System.out.println(res);
                    end = true;
                    break;
                }

                if(!visited[player[target]]){
                    visited[player[target]] = true;
                    queue.add(new int[]{player[target], res + 1});
                }

            }
            if(!end) {
                System.out.println(0);
            }
        }
    }
}



