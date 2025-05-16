import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] person = new int[n+1];
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            person[tmp] += 1;
            if(person[tmp] == k){
                System.out.println(tmp);
                System.exit(0);
            }
        }
        // Please write your code here.
        System.out.println(-1);
    }
}