import java.util.Scanner;
public class Main {
    static boolean val(int a){
        if(a % 2 != 0 && !(a % 3 == 0 && a % 9 != 0)){
            String tmp = String.valueOf(a);
            if(tmp.charAt(tmp.length()-1) != '5'){
                return true;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int t = 0;
        for(int i = x; i <= y; i++){
            if(val(i)){
                t += 1;
            }
        }
        System.out.println(t);
    }
}