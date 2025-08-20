import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.printf("");
        System.out.printf("n e\n");
        System.out.printf("- -----------\n");
        System.out.printf("0 1\n");
        System.out.printf("1 2\n");
        System.out.printf("2 2.5\n");
        
        double fac = 2;
        double i = 2;
        double res = 2.5;
        
        while(fac < 9){
            fac ++;
            i *= fac;
            res += 1 / i;
            System.out.printf("%.0f %.9f\n", fac, res);
        }
    }
}


