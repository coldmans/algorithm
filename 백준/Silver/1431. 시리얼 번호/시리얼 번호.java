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
        String[] strings = new String[n];
        for(int i = 0; i < n; i++){
            strings[i] = br.readLine();
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    int s1 = 0;
                    int s2 = 0;
                    for(int i = 0; i < o1.length(); i++){
                        if(o1.charAt(i) <= '9' && o1.charAt(i) >= '0'){
                            s1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                        }
                    }
                    for(int i = 0; i < o2.length(); i++){
                        if(o2.charAt(i) <= '9' && o2.charAt(i) >= '0'){
                            s2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                        }
                    }
                    if(s1 == s2){
                        return o1.compareTo(o2);
                    }
                    else{
                        return s1 - s2;
                    }
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        });

        for (String string : strings) {
            System.out.println(string);
        }


    }
}