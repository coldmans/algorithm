import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int tmp = 0;
        while(M != 0){
            tmp += arr[M];
            if(M % 2 == 1) M -= 1;
            else if(M % 2 == 0) M /= 2;
        }
        System.out.println(tmp);
    }
}