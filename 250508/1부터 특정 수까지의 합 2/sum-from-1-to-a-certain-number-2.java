import java.util.Scanner;

public class Main {
    public static int hap(int n, int tmp){
        if(n == 0){
            return tmp;
        }
        tmp += n;
        return hap(n-1, tmp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(hap(n,0));
    }
}