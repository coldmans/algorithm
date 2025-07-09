import java.util.*;
public class Main {
    static int min = Integer.MAX_VALUE;
    static void recur(int [] price, int [][] discount, int [] currentPrices, boolean[] visited, int count, int totalCost){
        if(count == price.length){
            min = Math.min(min, totalCost);
            return;
        }

        for(int i = 0; i < price.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            int cost = currentPrices[i];

            int [] backup = currentPrices.clone();

            for(int j = 0; j < price.length; j++){
                if(discount[i][j] > 0){
                    currentPrices[j] = Math.max(1, currentPrices[j] - discount[i][j]);
                }
            }
            recur(price, discount, currentPrices, visited, count+1, totalCost+cost);
            visited[i] = false;
            System.arraycopy(backup, 0, currentPrices, 0, currentPrices.length);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] price = new int[N];
        int [][] discount = new int[N][N];
        for(int i = 0; i < N; i++){
            price[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            int m = sc.nextInt();
            for(int j = 0; j < m; j++){
                int k = sc.nextInt();
                int o = sc.nextInt();
                discount[i][k-1] = o;
            }
        }
        int[] currentPrices = price.clone();
        boolean[] visited = new boolean[N];

        recur(price, discount, currentPrices, visited, 0, 0);

        System.out.println(min);
        sc.close();




    }
}




