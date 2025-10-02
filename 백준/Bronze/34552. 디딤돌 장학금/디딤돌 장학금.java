import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []arr = new int[11];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 11; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int res = 0;
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(z >= 17 && y >= 2.0){
                res += arr[x];
            }
        }
        System.out.println(res);



    }

}
