import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        boolean shuttle = false;
        boolean walk = false;

        if(a + b <= d){
            shuttle = true;
        }
        if(c <= d){
            walk = true;
        }

        if(shuttle && walk){
            System.out.println("~.~");
        }
        else if(shuttle){
            System.out.println("Shuttle");
        }
        else if(walk){
            System.out.println("Walk");
        }
        else{
            System.out.println("T.T");
        }

    }
}