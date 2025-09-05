import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++){
            for(int k = 0; k < 2; k++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("@");
                }
                for (int j = 0; j < N; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < N; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("@@@");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("@@@");
            }
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }



    }
}
