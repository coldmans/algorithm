import java.util.Scanner;

public class Main {
    public static void tmpPrint(int x){
        for(int i = 0; i < x; i ++){
            System.out.println("12345^&*()_");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        tmpPrint(n);
    }
}