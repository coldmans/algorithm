import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int N = sc.nextInt();
        if(N == 0) System.out.println(0);

        int num = 0;
        set.add(0);

        for(int i = 1; i <= N; i++){
            if (num - i < 0 || set.contains(num - i)){
                num += i;
            } else {
                num -= i;
            }

            if(i == N){
                System.out.println(num);
            } else {
                set.add(num);
            }
        }
    }
}
