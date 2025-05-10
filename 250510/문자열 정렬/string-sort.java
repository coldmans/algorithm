import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char ar[] = s.toCharArray();
        Arrays.sort(ar);
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]);
        }
    }
}