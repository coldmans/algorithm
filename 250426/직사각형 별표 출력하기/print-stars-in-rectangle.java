import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}