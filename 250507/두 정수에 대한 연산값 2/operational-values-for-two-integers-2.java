import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        if(a > b){
            System.out.println((a * 2) + " " + (b + 10));
        }
        else{
            System.out.println((a + 10) + " " + (b * 2));
        }
    }
}