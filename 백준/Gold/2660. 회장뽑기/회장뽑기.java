import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] graph = new int[N+1][N+1];
        for(int i = 1; i <= N; i++){
            Arrays.fill(graph[i], 2000);
            graph[i][i] = 0;
        }
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == -1){
                break;
            }
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for(int k = 1; k <= N; k++)
            for(int i = 1; i <= N; i++)
                for(int j = 1; j <= N; j++)
                    if(graph[i][j] > graph[i][k] + graph[k][j])
                        graph[i][j] = graph[i][k] + graph[k][j];

        int[] scores = new int[N+1];
        int minScore = 2000;

        for(int i = 1; i <= N; i++){
            int maxDist = 0;
            for(int j = 1; j <= N; j++){
                if(graph[i][j] < 2000) maxDist = Math.max(maxDist, graph[i][j]);
            }
            scores[i] = maxDist;
            if(minScore > maxDist) minScore = maxDist;
        }

        ArrayList<Integer> hubo = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            if(scores[i] == minScore) hubo.add(i);
        }

        System.out.println(minScore + " " + hubo.size());
        for (Integer i : hubo) {
            System.out.print(i + " ");
        }
    }
}
