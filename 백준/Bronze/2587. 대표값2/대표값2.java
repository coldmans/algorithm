import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.min;
import java.math.BigInteger;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum / 5);
        System.out.println(list.get(2));




    }
}