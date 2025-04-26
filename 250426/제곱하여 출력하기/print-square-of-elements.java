import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] li = new int[N];
        for(int i = 0; i < N; i++){
            li[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++){
            System.out.print(li[i] * li[i] + " ");
        }
    }
}