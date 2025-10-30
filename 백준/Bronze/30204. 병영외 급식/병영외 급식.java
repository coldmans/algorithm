import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(st.nextToken());
        }
        if(sum % x == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
