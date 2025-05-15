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
        int [][]graph = new int[2002][2002];
        for(int i = rect1_y1; i <= rect1_y2; i++){
            for(int j = rect1_x1; j <= rect1_x2; j++){
                graph[i+1000][j+1000] = 1;
            }
        }
        for(int i = rect2_y1; i < rect2_y2; i++){
            for(int j = rect2_x1; j < rect2_x2; j++){
                graph[i+1000][j+1000] = 0;
            }
        }
        int lx1 = 0;
        int ly1 = 0;
        int lx2 = 0;
        int ly2 = 0;
        boolean t = true;
        for(int i = 0; i <= 2000; i++){
            if(!t) break;
            for(int j = 0; j <= 2000; j++){
                if(graph[i][j] == 1){
                    
                    lx1 = i;
                    ly1 = j;
                    t = false;
                    break;
                }
            }
        }
        t = true;

        for(int i = 2000; i >= 0; i--){
            if(!t) break;
            for(int j = 2000; j >= 0; j--){
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