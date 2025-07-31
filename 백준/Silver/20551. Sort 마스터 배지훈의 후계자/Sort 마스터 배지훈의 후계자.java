import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int []tmp = new int[N];
        for(int i = 0; i < N; i++){
            tmp[i] = sc.nextInt();
        }
        Arrays.sort(tmp);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int t = sc.nextInt();
            int idx = lowerBound(tmp, t);

            if(idx != N && tmp[idx] == t){
                sb.append(idx).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        }
        System.out.print(sb);
    }

    static int lowerBound(int[] arr, int t){
        int left = 0, right = arr.length;
        while (left < right){
            int mid = (left + right) / 2;
            if(arr[mid] >= t) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}



