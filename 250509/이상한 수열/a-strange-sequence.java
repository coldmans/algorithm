import java.util.Scanner;
public class Main {
    public static int recur(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return recur(n/3) + recur(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(recur(n));
    }
}