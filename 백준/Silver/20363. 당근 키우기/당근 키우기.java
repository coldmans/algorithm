import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int big = (x > y) ? x : y;
        int small = (x > y ) ? y : x;

        System.out.println(big + (small / 10) + small);
    }
}




