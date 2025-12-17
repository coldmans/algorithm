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
        int n = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        String firstKey = sortedMap.keySet().stream().findFirst().get();
        System.out.println(firstKey);



    }
}