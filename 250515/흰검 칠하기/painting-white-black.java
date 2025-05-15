import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []x1 = new int[N];
        int []x2 = new int[N];
        int color[] = new int[N];
        int point = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d == 'L'){
                x1[i] = point - x + 1;
                x2[i] = point;
                point -= (x-1);
                color[i] = 1;
            }
            else{
                x1[i] = point;
                x2[i] = point + x - 1;
                point += (x-1);
                color[i] = 2;
            }
            x1[i] += 100000;
            x2[i] += 100000;
        }
        // Please write your code here.

        int [][]check = new int[200000][2];
        for(int i = 0; i < N; i++){
            for(int j = x1[i]; j <= x2[i]; j++){
                if(color[i] == 1){
                    check[j][0] += 1;
                    check[j][1] = 1; // 마지막 흰색
                }
                else if(color[i] == 2){
                    check[j][0] += 1;
                    check[j][1] = 2; // 마지막 흑색
                }
            }
        }
        int w = 0;
        int b = 0;
        int g = 0;
        for(int j = 0; j < check.length; j++){
            if(check[j][0] < 4 && check[j][0] > 0){
                if(check[j][1] == 1){
                    w += 1;
                }
                else if(check[j][1] == 2){
                    b += 1;
                }
            }
            else if(check[j][0] >= 4){
                g += 1;
            }
        }
        System.out.println(w + " " + b +  " " + g);
        
    }
}