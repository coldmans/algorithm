import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            System.out.println("*");
            System.exit(0);
        }
        for(int i = 0; i < N; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 0; i < N/2-1; i++){
            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j = 0; j < N - (i+2) * 2; j++){
                System.out.print(" ");
            }

            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
        if(N % 2 == 1){
            System.out.print("*");
            for(int i = 0; i < (N-3)/2; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int i = 0; i < (N-3)/2; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


        for(int i = N/2-2; i >= 0; i--){
            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j = 0; j < N - (i+2) * 2; j++){
                System.out.print(" ");
            }

            System.out.print("*");
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }




        for(int i = 0; i < N; i++){
            System.out.print("*");
        }







    }
}