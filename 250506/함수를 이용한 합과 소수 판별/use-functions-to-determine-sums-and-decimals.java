import java.util.Scanner;
public class Main {
    static boolean validate(int x){
        if(x == 100){
            return false;
        }
        int tmp = 0;
        tmp += x % 10;
        tmp += x / 10;
        if (tmp % 2 == 0){
            for(int i = 2; i <= x/2; i++){
                if(x % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        // Please write your code here.
        for(int i = a; i <= b; i++){
            if(validate(i)) tmp++;
        }
        System.out.println(tmp);
    }
}