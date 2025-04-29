import java.util.Scanner;

public class Main {
    public static void ggg(int n, int m){
        while(n != 0){
            int tmp = n;
            n = m % n;
            m = tmp;
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        ggg(n, m);

    }
}