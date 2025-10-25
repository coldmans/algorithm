import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = 0;
        for(int i = 0; i < n; i++){
            x = Integer.parseInt(st.nextToken());
        }
        if(x == 0){
            System.out.println("YES");
            System.out.println(0);
        }
        else{
            System.out.println("YES");
            System.out.println(x + "" + x + "" +x);
        }



    }
}
