import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.
        int [][]graph = new int[2001][2001];
        for(int i = rect1_y1; i <= rect1_y2; i++){
            for(int j = rect1_x1; j <= rect1_x2; j++){
                graph[i+1000][j+1000] = 1;
            }
        }
        for(int i = rect2_y1; i <= rect2_y2; i++){
            for(int j = rect2_x1; j <= rect2_x2; j++){
                graph[i+1000][j+1000] = 0;
            }
        }
        int lx1 = 0;
        int ly1 = 0;
        int lx2 = 0;
        int ly2 = 0;
        boolean t = true;
        for(int i = rect1_y1 + 999; i <= rect1_y2 + 1001; i++){
            if(!t) break;
            for(int j = rect1_x1+999; j <= rect1_x2 + 1001; j++){
                if(graph[i][j] == 1){
                    lx1 = i;
                    ly1 = j;
                    t = false;
                    break;
                }
            }
        }
        t = true;

        for(int i = rect1_y2 + 1001; i >= rect1_y1 + 999; i--){
            if(!t) break;
            for(int j = rect1_x2+1001; j >= rect1_x1+999; j--){
                if(graph[i][j] == 1){
                    lx2 = i;
                    ly2 = j;
                    t = false;
                    break;
                }
            }
        }

        System.out.println((lx2-lx1) * (ly2-ly1));

    }
}