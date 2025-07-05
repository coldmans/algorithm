import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 11, b = 11, c = -11, d = -11;
        int N = sc.nextInt();
        for(int i = 0; i < N; i ++){
            int ta = sc.nextInt();
            int tb = sc.nextInt();
            int tc = sc.nextInt();
            int td = sc.nextInt();
            a = Math.min(a, ta);
            b = Math.min(b, tb);
            c = Math.max(c, tc);
            d = Math.max(d, td);
            System.out.println((Math.abs(c-a) + Math.abs(d-b)) * 2);
        }



    }
}
