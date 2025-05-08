import java.util.Scanner;
public class Main {
    public static void recur(int n, int tmp){
        if(n == 1){
            System.out.println(tmp);
            return;
        }
        if(n % 2 == 0){
            recur(n / 2, tmp + 1);
        }
        else if(n % 2 == 1){
            recur(n * 3 + 1, tmp + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recur(n,0);


    }
}