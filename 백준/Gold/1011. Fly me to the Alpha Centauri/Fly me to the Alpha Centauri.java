import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dx = 1;
            int ctt = 0;
            while(x < y){
                x = x + dx;
                ctt += 1;
                if(x >= y){
                    break;
                }
                y = y - dx;
                ctt += 1;
                dx += 1;
            }
            System.out.println(ctt);
        }
    }
}



