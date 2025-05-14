import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int [] cap = new int[10000];
        int index = 0;
        while(true){
            if(n < 2){
                cap[index++] = n;
                break;
            }
            cap[index++] = n % 2;
            n /= 2; 
        }
        for(int i = index-1; i >= 0; i--){
            System.out.print(cap[i]);
        }
    }
}