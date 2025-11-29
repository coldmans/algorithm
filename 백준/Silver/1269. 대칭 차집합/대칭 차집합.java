import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Act = Integer.parseInt(st.nextToken());
        int Bct = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < Act; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < Bct; i++){
            int t = Integer.parseInt(st.nextToken());
            if(set.contains(t)){
                set.remove(t);
            }
            else{
                set.add(t);
            }
        }
        System.out.println(set.size());
    }
}