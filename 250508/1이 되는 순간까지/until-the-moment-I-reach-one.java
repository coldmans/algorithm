import java.util.Scanner;
public class Main {
    public static void recur(int n, int ctt){
        if(n == 1){
            System.out.println(ctt);
            return;
        }
        if(n % 2 == 0){
            recur(n / 2, ctt + 1);
        }
        else{
            recur(n / 3, ctt + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recur(n,0);
    }
}