import java.util.Scanner;
public class Main {
    public static void yami(int n, int m){
        if(n < m){
            System.out.println();
            return;
        }
        System.out.print(m + " ");
        yami(n, m+1);
    }

    public static void yumi(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        yumi(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        yami(n,1);
        yumi(n);
    }
}