import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char []copy = new char[N];
        String tmp = sc.next();
        for(int i = 0; i < N; i++){
            copy[i] = tmp.charAt(i);
        }
        for(int i = 0; i < K; i++){
            char [] arr = copy.clone();
            for(int j = 0; j < N; j++){
                int left = (j - 1 < 0) ?  N - 1 : j - 1;
                int right = (j + 1 >= N) ? 0 : j + 1;
                if((copy[left] == copy[right] && copy[j] == copy[left]) || (copy[left] != copy[j] && copy[right] != copy[j] && copy[left] != copy[right])) {
                    arr[j] = 'B';
                }
                else if((copy[left] == 'R' && copy[right] == 'R' && copy[j] == 'G') || (copy[left] == 'R' && copy[right] == 'G' && copy[j] == 'R') || (copy[left] == 'G' && copy[right] == 'R' && copy[j] == 'R')){
                    arr[j] = 'R';
                }
                else if((copy[left] == 'G' && copy[right] == 'G' && copy[j] == 'B') || (copy[left] == 'G' && copy[right] == 'B' && copy[j] == 'G') || (copy[left] == 'B' && copy[right] == 'G' && copy[j] == 'G')){
                    arr[j] = 'R';
                }
                else if((copy[left] == 'B' && copy[right] == 'B' && copy[j] == 'R') || (copy[left] == 'B' && copy[right] == 'R' && copy[j] == 'B') || (copy[left] == 'R' && copy[right] == 'B' && copy[j] == 'B')){
                    arr[j] = 'R';
                }
                else{
                    arr[j] = 'G';
                }
            }
            System.arraycopy(arr, 0, copy, 0, N);
        }

        int [] colorCount = new int[3];
        for(int i = 0; i < N; i++){
            if(copy[i] == 'R') colorCount[0]++;
            else if(copy[i] == 'G') colorCount[1]++;
            else if(copy[i] == 'B') colorCount[2]++;
        }
        System.out.println(colorCount[0] + " " + colorCount[1] + " " + colorCount[2]);

    }
}




