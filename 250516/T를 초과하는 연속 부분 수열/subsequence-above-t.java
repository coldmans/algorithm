import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int maxi = 0;
        int tmp = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > t){
                tmp++;
            }
            else{
                maxi = Math.max(maxi, tmp);
                tmp = 0;
            }
        }
        maxi = Math.max(maxi,tmp);
        System.out.println(maxi);
    }
}