import java.util.*;

public class Main {

    static boolean[] isPrime;
    static int isPrimes(int y, int a){
        isPrime = new boolean[y+1];

        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(y); i++){
            if(isPrime[i]){
                for(int j = i * i; j<= y; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = a; i < y; i++){
            if(isPrime[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
        int []arr = new int[N];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < N; i++){
             arr[i] = arr[i-1] + 1;
        }
        arr[N-1] = isPrimes(1001, arr[N-2] + 1);
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
