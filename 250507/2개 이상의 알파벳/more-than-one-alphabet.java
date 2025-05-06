import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        boolean tmp = true;
        char c = A.charAt(0);
        for(int i = 1; i < A.length(); i++){
            if(A.charAt(i) != c){
                tmp = false;
                break;
            }
        }
        if(tmp){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }
}