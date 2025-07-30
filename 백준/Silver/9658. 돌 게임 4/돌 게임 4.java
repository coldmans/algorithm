import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean [] tmp = new boolean[N+1];

        if(N <= 9){
            if(N == 2 || N == 4 || N == 5 || N == 6 || N == 7 || N == 9){
                System.out.println("SK");
            }
            else{
                System.out.println("CY");
            }
            System.exit(0);
        }

        tmp[1] = false;
        tmp[2] = true;
        tmp[3] = false;
        tmp[4] = true;
        tmp[5] = true;
        tmp[6] = true;
        tmp[7] = true;
        tmp[8] = false;
        tmp[9] = true;

        for(int i = 10; i <= N; i++){
            if(tmp[i-1] && tmp[i-3] && tmp[i-4]){
                tmp[i] = false;
            }
            else{
                tmp[i] = true;
            }
        }

        if(tmp[N]){
            System.out.println("SK");
        }
        else{
            System.out.println("CY");
        }

    }
}



