import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[101];
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int y1 = sc.nextInt();
            for(int j = y; j < y1; j++){
                x[j] += 1;
            }
        }
        // Please write your code here.
        System.out.println(Arrays.stream(x).max().getAsInt());
    }
}