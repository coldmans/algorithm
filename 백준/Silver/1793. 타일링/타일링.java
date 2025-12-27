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
        String input = "";
        String []arr = new String[2800];
        arr[0] = "1";
        arr[1] = "1";
        arr[2] = "3";
        arr[3] = "5";
        for(int i = 4; i < 251; i++){
            arr[i] = String.valueOf(new BigInteger(arr[i-1]).add(new BigInteger(arr[i-2]).multiply(BigInteger.valueOf(2))));
        }
        while((input = br.readLine()) != null){
            int t = Integer.parseInt(input);
            System.out.println(arr[t]);

        }



    }
}