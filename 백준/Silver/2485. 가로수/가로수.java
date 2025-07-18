import java.util.Scanner;

public class Main {

    static int recur(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] li = new int[N];
        for(int i = 0; i < N; i++){
            li[i] = sc.nextInt();
        }

        int min = li[1] - li[0];
        for(int i = 2; i < N; i++){
            min = recur(li[i] - li[i-1], min);
        }
        int ctt = 0;
        for(int i = 0; i < N - 1; i++){
            ctt += ((li[i+1] - li[i]) / min) - 1;
        }
        System.out.println(ctt);
    }
}