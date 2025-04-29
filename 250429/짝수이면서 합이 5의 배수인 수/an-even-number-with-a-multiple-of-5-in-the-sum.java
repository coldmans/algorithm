import java.util.Scanner;
public class Main {
    public static void zzac(int x){
        if (x % 2 == 0){
            int a = x / 10;
            int b = x - a * 10;
            if((a + b) % 5 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        zzac(n);

    }
}