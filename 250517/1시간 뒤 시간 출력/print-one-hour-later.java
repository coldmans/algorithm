import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringTokenizer st = new StringTokenizer(s,":");

        System.out.println(Integer.valueOf(st.nextToken())+1 + ":" + st.nextToken());
        
    }
}