import java.io.*;
import java.util.*;

public class Main {

    static int []dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int []dy = {0, 1, 0, -1, -1, 1, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            System.out.println("I love DGU");
        }
    }
}