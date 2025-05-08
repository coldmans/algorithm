import java.util.Scanner;

public class Main {
    public static void check(int[] arr, int tmp, int n){
        if(n == arr.length){
            System.out.println(tmp);
            return;
        }
        int a = tmp;
        int b = arr[n];
        while(b != 0){
            int t = b;
            b = tmp % b;
            tmp = t;
        }
        tmp = (a* arr[n]) / tmp;
        
        check(arr, tmp, n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        check(arr, arr[0], 1);
    }
}