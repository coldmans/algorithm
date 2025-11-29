import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t = br.readLine();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < t.length(); i++){
            for(int j = i; j < t.length(); j++){
                set.add(t.substring(i,j+1));
            }
        }
        System.out.println(set.size());

    }
}