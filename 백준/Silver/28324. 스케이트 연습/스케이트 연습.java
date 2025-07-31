import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []max = new int[N];
        for(int i = 0; i < N; i++){
            max[i] = sc.nextInt();
        }
        int []real = new int[N];
        real[N-1] = 1;
        for(int i = N - 2; i >= 0; i--){
            real[i] = real[i+1] + 1;
            if(real[i] > max[i]){
                real[i] = max[i];
            }
        }
        int res = 0;

        for(int i = 0; i < N; i++){
            res += real[i];
        }
        System.out.println(res);

    }
}



