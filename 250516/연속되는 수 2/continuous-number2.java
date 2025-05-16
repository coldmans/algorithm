import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }{
        // Please write your code here.
        int maxi = 0;
        int tmp = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                maxi = Math.max(maxi, tmp);
                tmp = 1;
            }
            else{
                tmp++;
            }
        }
        if(tmp != 0){
            maxi = Math.max(maxi, tmp);
        }
        System.out.println(maxi);
    }
}
}