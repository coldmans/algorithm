import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("-");
        int y = 0;
        int m = 0;
        int d = 0;

        int day = Integer.parseInt(br.readLine());

        y = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        d = Integer.parseInt(s[2]);

        while(360 <= day){
            y += 1;
            day -= 360;
        }
        while(30 <= day){
            m += 1;
            day -= 30;
        }
        while(1 <= day){
            d += 1;
            day -= 1;
        }

        while (d >= 31){
            m += 1;
            d -= 30;
        }

        while (m >= 13){
            y += 1;
            m -= 12;
        }

        System.out.print(y + "-");
        if(m >= 10){
            System.out.print(m +"-");
        }
        else{
            System.out.print("0"+m+"-");
        }

        if(d >= 10){
            System.out.print(d);
        }
        else{
            System.out.print("0" + d);
        }



    }
}
