import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringTokenizer st = new StringTokenizer(n,"-");
        ArrayList<Integer> arr = new ArrayList<>();
        while(st.hasMoreTokens()){
            arr.add(Integer.valueOf(st.nextToken()));
        }
        System.out.println(arr.get(2) + "." + arr.get(0) + "." + arr.get(1));
        
    }
}