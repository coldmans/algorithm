import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] S = new int[N];
        for(int i = 0; i < N; i++){
            S[i] = scanner.nextInt();
        }
        for(int i = N-1; i>= 0; i--){
            if (S[i] % 2 == 0){
                System.out.print(S[i] + " ");
            }
        }
    }
}