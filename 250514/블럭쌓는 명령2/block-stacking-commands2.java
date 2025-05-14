import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] block = new int[N+1];

        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A > B){
                int tmp = A;
                A = B;
                B = tmp;
            }
            for(int j = A; j <= B; j++){
                block[j] += 1;
            }
        }
        // Please write your code here.
        System.out.println(Arrays.stream(block).max().getAsInt());
    }
}