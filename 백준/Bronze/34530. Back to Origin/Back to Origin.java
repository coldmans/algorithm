import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        
        // 360과 d의 최대공약수 구하기
        int g = gcd(360, d);
        
        // 출발점으로 돌아오는 최소 이동 횟수
        int n = 360 / g;
        
        System.out.println(n);
        sc.close();
    }
    
    // 최대공약수를 구하는 유클리드 호제법
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}