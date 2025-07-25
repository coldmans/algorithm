import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int []tmp = new int[K];
        int wax = S / K;
        Arrays.fill(tmp, wax);
        int w = S - K * wax;
        for(int i = 0; i < K; i++){
            if(w <= 0){
                break;
            }
            tmp[i] += 1;
            w -= 1;
        }

        Long res = 1L;
        for(int i = 0; i < K; i++){
            res *= tmp[i];
        }

        System.out.println(res);

    }
}

