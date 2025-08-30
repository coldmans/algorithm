import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main{
    static void pr(int K){
        System.out.println(K +" bottles of beer on the wall, "+ K +" bottles of beer.\n" +
                "Take one down and pass it around, "+ (K-1) +" bottles of beer on the wall.");
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = N; i > 2; i--){
            pr(i);
        }
        if(N != 1)
            System.out.println("2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n");

        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
        if(N != 1)
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"+
                "Go to the store and buy some more, "+ N +" bottles of beer on the wall.");
        else
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"+
                    "Go to the store and buy some more, "+ N +" bottle of beer on the wall.");

    }
}

