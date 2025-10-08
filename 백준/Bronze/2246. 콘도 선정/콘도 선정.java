import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new int[]{x,y});
        }

        list.sort(Comparator.comparingInt((int []a) -> a[0]).thenComparingInt(a -> a[1]));

        int res = 0;

        for(int i = 0; i < T; i++){
            boolean fake = false;

            for(int j = i - 1; j >= 0; j--){
                if(list.get(i)[1] >= list.get(j)[1]){
                    fake = true;
                    break;
                }
            }
            if(fake){
                continue;
            }
            
            res += 1;

        }
        System.out.println(res);


    }
}
