import java.util.Scanner;
public class Main {
    static void check(int[] x, int[] y){
        int ready = -1;
        for(int i = 0; i < x.length; i++){
            if(x[i] == y[0]){
                ready = i;
                break;
            }
        }
        if(ready == -1){
            System.out.println("No");
            return;
        }
        int j = 0;
        int i = ready;
        int ch = 1;
        while(i < x.length && j < y.length){
            if(x[i] != y[j]){
                System.out.println("No");
                ch = 0;
                break;
            }
            i += 1;
            j += 1;
        }
        if(ch == 1){
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        check(a,b);
    }
}