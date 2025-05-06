import java.util.Scanner;
public class Main {
    public static void check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        check(input);
        
    }
}