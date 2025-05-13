import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            points[i][1] = i+1;
            points[i][0] = Math.abs(a) + Math.abs(b);
        }
        // Please write your code here.
        Arrays.sort(points,(a,b) -> {
            return a[0] - b[0];
        });
        for(int i = 0; i < n; i++){
            System.out.println(points[i][1]);
        }
    }
}