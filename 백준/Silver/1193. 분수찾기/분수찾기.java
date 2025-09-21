import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int tmp = 1;
        int ctt = 1;

        while(true){
            if(tmp + ctt > x){
                break;
            }
            tmp += ctt;
            ctt += 1;
        }


        int i = 1;
        int j = ctt;

        for(int k = tmp; k < x; k++){
            i += 1;
            j -= 1;
        }
        if(ctt % 2 == 1){
            System.out.println(j + "/" + i);
        }
        else {
            System.out.println(i + "/" + j);
        }
    }
}

