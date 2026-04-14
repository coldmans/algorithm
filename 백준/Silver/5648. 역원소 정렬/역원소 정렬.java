import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        List<Long> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int ctt = 0;
        
        while(true) {
            while (st.hasMoreTokens()) {
                sb.append(st.nextToken());
                ctt += 1;
                list.add(Long.parseLong(String.valueOf(sb.reverse())));
                sb = new StringBuffer();
            }
            if(ctt == T){
                break;
            }
            st = new StringTokenizer(br.readLine());
        }

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }
}