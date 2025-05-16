import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []A = new int[n];
        int []B = new int[m];
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int a = sc.nextInt();
            if(dir == 'R'){
                A[i] = a;
            }
            else{
                A[i] = -a;
            }
        }
        for(int i = 0; i < m; i++){
            char dir = sc.next().charAt(0);
            int a = sc.nextInt();
            if(dir == 'R'){
                B[i] = a;
            }
            else{
                B[i] = -a;
            }
        }
        int i = 0;
        int j = 0;
        int Ap = 0;
        int Bp = 0;
        boolean suc = false;
        int time = 0;
        while(true){
            time ++;
            if(i == n && j == m) break;
            if(i < n && A[i] == 0) i += 1;
            if(j < m && B[j] == 0) j += 1;
            if(i < n){
            if(A[i] > 0){
                A[i] -= 1;
                Ap += 1;
            }
            else if(A[i] < 0){
                A[i] += 1;
                Ap -= 1;
            }
            }
            if(j < m){
            if(B[j] > 0){
                B[j] -= 1;
                Bp += 1;
            }
            else if(B[j] < 0){
                B[j] += 1;
                Bp -= 1;
                
            }
            }
            if(Ap == Bp){
                suc = true;
                break;
            }

            
        }
        if(suc){
            System.out.println(time);
        }
        else{
            System.out.println(-1);
        }

    }
}