import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char []ch = new char[N];
        int res = 0;
        boolean is = false;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            char tt = st.nextToken().charAt(0);
            res = (res + tmp) % N;
            if(ch[res] == '\0'){
                if(set.contains(tt)){
                    is = true;
                }
                else{
                    set.add(tt);
                }
                ch[res] = tt;
            }
            else if(ch[res] == tt){
                ch[res] = tt;
            }
            else{
                is = true;
            }
        }

        if(is){

            System.out.println("!");
        }
        else{
            int last = res;
            System.out.print(ch[res]);
            res = (res - 1);
            if(res == -1){
                res = N - 1;
            }
            while(true){
                if(last == res){
                    break;
                }

                if(ch[res] == '\0'){
                    System.out.print("?");
                }
                else {
                    System.out.print(ch[res]);
                }
                res = (res - 1);
                if(res == -1){
                    res = N - 1;
                }

            }
        }
    }
}