import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int [] k = {1,-1,0,0,0,0};
    static int [] x = {0, 0, 1, -1, 0, 0};
    static int [] y = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int C = sc.nextInt();

            if(L == 0){
                break;
            }

            int [][][] graph = new int[L][R][C];
            int SH = 0;
            int SX = 0;
            int SY = 0;
            int EH = 0;
            int EX = 0;
            int EY = 0;
            for(int h = 0; h < L; h++){
                for(int i = 0; i < R; i++){
                    String tmp = sc.next();
                    for(int j = 0; j < C; j++){
                        char t = tmp.charAt(j);
                        if(t == 'S'){
                            SH = h;
                            SY = i;
                            SX = j;
                            graph[h][i][j] = 0;
                        }
                        else if(t == 'E'){
                            EH = h;
                            EY = i;
                            EX = j;
                            graph[h][i][j] = 0;
                        }
                        else if(t == '.'){
                            graph[h][i][j] = 0;
                        }
                        else{
                            graph[h][i][j] = -1;
                        }
                    }
                }
                String beanJool = sc.nextLine();
            }

            boolean [][][] visited = new boolean[L][R][C];
            Queue<int []> queue = new LinkedList<>();
            queue.offer(new int[]{SH,SY,SX, 0});
            visited[SH][SY][SX] = true;
            boolean isEnd = false;
            while(!queue.isEmpty()){
                int [] wax = queue.poll();
                int ek = wax[0];
                int ey = wax[1];
                int ex = wax[2];
                int dur = wax[3];

                if(ek == EH && ey == EY && ex == EX){
                    System.out.println("Escaped in "+ dur +" minute(s).");
                    isEnd = true;
                    break;
                }

                for(int i = 0; i < 6; i++){
                    int dk = k[i] + ek;
                    int dy = y[i] + ey;
                    int dx = x[i] + ex;

                    if(0 <= dk && dk < L && 0 <= dy && dy < R && 0 <= dx && dx < C && visited[dk][dy][dx] == false && graph[dk][dy][dx] == 0){
                        visited[dk][dy][dx] = true;
                        queue.offer(new int[]{dk,dy,dx,dur+1});
                    }
                }
            }
            if(isEnd == false){
                System.out.println("Trapped!");
            }

        }
    }
}
