import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        int []dal = new int[N];
        for(int i = 0; i < N; i++){
            dal[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            int tmp = sc.nextInt();

            if(N == V){
                if(tmp > N){
                    System.out.println(dal[N-1]);
                }
                else{
                    System.out.println(dal[tmp]);
                }
            }

            else if(tmp < N){
                System.out.println(dal[tmp]);
            }
            else{
                tmp = tmp % (N - V + 1);
                if(tmp < V -1){
                    tmp += (N - V + 1);
                }
                System.out.println(dal[tmp]);
            }
        }

    }
}

