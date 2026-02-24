import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                set.add(list.get(i) + list.get(j));
            }
        }

        int max = 0;

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                if(set.contains(list.get(j) - list.get(i))){
                    max = Math.max(max, list.get(j));
                }
            }
        }

        System.out.println(max);







    }
}