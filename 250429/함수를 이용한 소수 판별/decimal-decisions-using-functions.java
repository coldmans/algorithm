import java.util.Scanner;

public class Main {

    public static boolean[] getPrimesUpTo(int max) {
        boolean[] isPrime = new boolean[max + 1];

        // 처음엔 전부 소수로 가정
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        // 체 수행
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean[] isPrime = getPrimesUpTo(B);

        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (isPrime[i]) sum += i;
        }

        System.out.println(sum);
    }
}
