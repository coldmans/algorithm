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
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        if(x >= 6){
            System.out.println("Success!");
        }
        else{
            System.out.println("Oh My God!");
        }




    }
}