import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []gan = new int[N];
        for(int i = 0; i < N; i++){
            gan[i] = sc.nextInt();
        }
        int []dp = new int[N];
        
        for(int i = 0; i < N; i++){
            dp[i] = gan[i];
        }
        for(int i = 1; i < N; i++){
            for(int j = i; j >= 0; j--){
                if(gan[i] > gan[j]){
                    dp[i] = Math.max(dp[i], dp[j] + gan[i]);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}

