import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        for(int i = 0; i < 3; i++){
            int t = sc.nextInt();
            int ctt = 0;
            int tmp = (t ) % (A + B);
            int ttmp = (t) % (C+D);
            if(0 < tmp && tmp <= A){
                ctt += 1;
            }
            if(0 < ttmp && ttmp <= C){
                ctt += 1;
            }
            System.out.println(ctt);
        }




    }
}
