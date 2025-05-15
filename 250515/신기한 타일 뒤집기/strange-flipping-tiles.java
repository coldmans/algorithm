import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []tile = new int[2000000];
        int point = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d == 'R'){
                for(int j = point; j < point + x; j++){
                    tile[j+1000000] = 1;
                }
                point += (x-1);
            }
            else{
                for(int j = point; j > point - x; j--){
                    tile[j+1000000] = -1;
                }
                point -= (x-1);
            }
        }
        // Please write your code here.
        int w = 0;
        int b = 0;
        for(int i = 0; i<tile.length; i++){
            if(tile[i] == 1){
                b += 1;
            }
            else if(tile[i] == -1){
                w += 1;
            }
        }
        System.out.println(w + " " + b);


    }
}