import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String tmp = sc.next();
        char []li = new char[N];
        for(int i = 0; i < N; i++){
            li[i] = tmp.charAt(i);
        }

        char []li2 = new char[N];

        if(tmp.charAt(0) == 'B'){
            for(int i = 0; i < N; i++){
                li2[i] = 'B';
            }
        }
        else{
            for(int i = 0; i < N; i++){
                li2[i] = 'R';
            }
        }
        int i = 1;
        int ctt = 1;
        while(i < N){
            if(li2[i] == li[i]){
                i++;
                continue;
            }
            ctt++;
            while(i < N && li2[i] != li[i]){
                li2[i] = li[i];
                i++;
            }
        }
        System.out.println(ctt);

    }
}




