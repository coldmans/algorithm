import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(s.length() < M) continue;
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) == map.get(o2)){
                    if(o1.length() == o2.length()){
                        return o1.compareTo(o2);
                    }
                    else{
                        return o2.length() - o1.length();
                    }
                }
                else{
                    return map.get(o2) - map.get(o1);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);







    }
}