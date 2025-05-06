import java.util.Scanner;

public class Main {
    static int[] change(int a, int b){
        return new int[]{b,a};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int[] result = change(n,m);
        n = result[0];
        m = result[1];

        System.out.println(n + " " + m);
    }
}