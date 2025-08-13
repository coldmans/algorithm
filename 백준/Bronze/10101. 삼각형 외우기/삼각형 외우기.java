import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a == b && a == c && b == c && a == 60){
            System.out.println("Equilateral");
        }
        else if((a == b || a == c || b == c) && a + b+ c == 180){
            System.out.println("Isosceles");
        }
        else if((a != b & a != c && b != c) && a + b+ c == 180){
            System.out.println("Scalene");
        }
        else{
            System.out.println("Error");
        }
    }
}


