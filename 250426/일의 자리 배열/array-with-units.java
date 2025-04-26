import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] li = new int[10];
        li[0] = N;
        li[1] = M;
        for (int i = 2; i < 10; i++){
            int tmp;
            if(li[i-1] + li[i-2] >= 10){
                tmp = li[i-1] + li[i-2] - 10;
            }
            else{
                tmp = li[i-1] + li[i-2];
            }
            li[i] = tmp;
        }

        for (int i = 0; i < 10; i++){
            System.out.print(li[i] + " ");
        }
    }
}