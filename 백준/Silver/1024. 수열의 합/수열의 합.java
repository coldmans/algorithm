import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        for (int i = L; i < 101; i++) {
            double start = (double) (N - (i * (i - 1)) / 2) / i;
            if(start % 1 == 0.0 && start >= 0){
                start = (int) start;
                for(int j = 0; j < i; j++){
                    System.out.print((int)start + j + " ");
                }
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}


