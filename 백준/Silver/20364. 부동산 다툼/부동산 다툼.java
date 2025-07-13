import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int []li = new int[N+1];
        for(int i = 0; i < Q; i++){
            int bang = sc.nextInt();
            int tmp = getCollision(li, bang);
            if(tmp != -1){
                System.out.println(tmp);
            }
            else{
                li[bang] = 1;
                System.out.println(0);
            }
        }

    }
    static int getCollision(int li[], int bang){
        int tmp = -1;
        while(bang > 0){
            if(li[bang] == 1){
                tmp = bang;
            }
            bang /= 2;
        }
        return tmp;
    }
}





