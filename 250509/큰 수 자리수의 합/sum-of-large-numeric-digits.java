import java.util.Scanner;
public class Main {
    public static int check(int a){
        if(a < 10){
            return a;
        }
        return check(a / 10) + a % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(check(a*b*c));
    }
}