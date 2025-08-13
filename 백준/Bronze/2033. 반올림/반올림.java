import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        int [] arr = new int[N.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(N.charAt(i) + "");
        }

        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] >= 10){
                arr[i] -= 10;
                arr[i-1] += 1;
            }
            if(arr[i] >= 5){
                arr[i] = 0;
                arr[i-1] += 1;
            }
            else{
                arr[i] = 0;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}


