import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double res = 0;
        int ctt = 0;
        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            double d = Double.parseDouble(st.nextToken());
            ctt += d;
            String h = st.nextToken();
            if(h.equals("A+")){
                res += d * 4.5;
            }
            else if(h.equals("A0")){
                res += d * 4.0;
            }
            else if(h.equals("B+")){
                res += d * 3.5;
            }
            else if(h.equals("B0")){
                res += d * 3.0;
            }
            else if(h.equals("C+")){
                res += d * 2.5;
            }
            else if(h.equals("C0")){
                res += d * 2.0;
            }
            else if(h.equals("D+")){
                res += d * 1.5;
            }
            else if(h.equals("D0")){
                res += d * 1.0;
            }
            else if(h.equals("F")){
                res += d * 0;
            }
            else{
                ctt -= d;
            }
        }

        res /= (ctt);

        System.out.printf("%.6f", res);


    }
}