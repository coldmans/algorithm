import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < i; j++){
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }
}