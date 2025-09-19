import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else{
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        if (x1 == x2 && x2 == x3){
            System.out.println("WHERE IS MY CHICKEN?");
        }
        else if(y1 == y2 && y2 == y3){
            System.out.println("WHERE IS MY CHICKEN?");
        }
        else{
            int tx = gcd(x1, x2);
            tx = gcd(tx, x3);
            int ty = gcd(y1, y2);
            ty = gcd(ty, y3);

            int yy = 0;
            int xx = 0;
            int res = 0;
            while(yy < 1000 && xx < 1000){
                yy += ty;
                xx += tx;
                if(yy == y1 && xx == x1){
                    res += 1;
                }
                else if(yy == y2 && xx == x2){
                    res += 1;
                }
                else if(yy == y3 && xx == x3){
                    res += 1;
                }
                if(res == 3){
                    System.out.println("WHERE IS MY CHICKEN?");
                    System.exit(0);
                }
            }

            System.out.println("WINNER WINNER CHICKEN DINNER!");
        }


    }
}