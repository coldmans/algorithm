import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static int M;

    public static class Dice{
        int w;
        int m;
        int left;
        int right;
        int b;
        int f;

        public Dice(){
            this.w = 0;
            this.m = 0;
            this.left = 0;
            this.right = 0;
            this.b = 0;
            this.f = 0;
        }

        public void north(){
            int tmpW = w;
            int tmpM = m;
            int tmpB = b;
            int tmpF = f;
            this.m = tmpB;
            this.w = tmpM;
            this.b = tmpF;
            this.f = tmpW;
        }

        public void south(){
            int tmpW = w;
            int tmpM = m;
            int tmpB = b;
            int tmpF = f;
            this.m = tmpW;
            this.w = tmpF;
            this.b = tmpM;
            this.f = tmpB;
        }

        public void east(){
            int tmpL = left;
            int tmpM = m;
            int tmpR = right;
            int tmpF = f;

            this.m = tmpL;
            this.right = tmpM;
            this.left = tmpF;
            this.f = tmpR;
        }

        public void west(){
            int tmpL = left;
            int tmpM = m;
            int tmpR = right;
            int tmpF = f;

            this.m = tmpR;
            this.right = tmpF;
            this.left = tmpM;
            this.f = tmpL;
        }

        public void update(int tmp){
            this.f = tmp;
        }

        public int getM(){
            return this.m;
        }

        public int getF(){
            return this.f;
        }

    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m[][] = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Dice dice = new Dice();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < k; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp == 4 && y + 1 < N){
                dice.south();
                y += 1;
                if(m[y][x] == 0){
                    m[y][x] = dice.getF();
                }
                else{
                    dice.update(m[y][x]);
                    m[y][x] = 0;
                }
            }
            else if(tmp == 3 && y -1 >= 0){
                dice.north();
                y -= 1;
                if(m[y][x] == 0){
                    m[y][x] = dice.getF();
                }
                else{
                    dice.update(m[y][x]);
                    m[y][x] = 0;
                }
            }
            else if(tmp == 1 && x + 1 < M){
                dice.east();
                x += 1;
                if(m[y][x] == 0){
                    m[y][x] = dice.getF();
                }
                else{
                    dice.update(m[y][x]);
                    m[y][x] = 0;
                }
            }
            else if(tmp == 2 && x - 1 >= 0){
                dice.west();
                x -= 1;
                if(m[y][x] == 0){
                    m[y][x] = dice.getF();
                }
                else{
                    dice.update(m[y][x]);
                    m[y][x] = 0;
                }
            }
            else{
                continue;
            }
            System.out.println(dice.getM());

        }

    }
}