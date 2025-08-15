import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sibal = br.readLine();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int ctt = 0;
        while(i < sibal.length()){
            if(sibal.charAt(i) == 'X'){
                if(ctt == 4){
                    sb.append("AAAA");
                    ctt = 0;
                }
                ctt += 1;
            }
            else{
                if(ctt == 0){
                    i += 1;
                    sb.append(".");
                    continue;
                }
                else if(ctt == 1 || ctt == 3){
                    System.out.println(-1);
                    System.exit(0);
                }
                else if(ctt == 2){
                    sb.append("BB");
                    ctt = 0;
                }
                else if(ctt == 4){
                    sb.append("AAAA");
                    ctt = 0;
                }
                sb.append(".");
            }
            i+=1;
        }

        if(ctt == 1 || ctt == 3){
            System.out.println(-1);
            System.exit(0);
        }
        else if(ctt == 2){
            sb.append("BB");
        }
        else if(ctt == 4){
            sb.append("AAAA");
        }

        System.out.print(sb);



    }
}


