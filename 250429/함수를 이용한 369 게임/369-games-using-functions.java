import java.util.Scanner;
public class Main {

    public static int pan(int n){
        int res = 0;
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9'){
                res += 1;
                break;
            }
        }
        return res;
    }

    public static void fooor(int a, int b){
        int res = 0;
        for(int i = a; i <= b; i++){
            if(i % 3 == 0){
                res += 1;
            }
            else{
                res += pan(i);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        fooor(A,B);
    
    }
}