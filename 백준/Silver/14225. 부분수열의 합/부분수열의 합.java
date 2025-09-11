import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);

        long target = 1; // 만들 수 없는 최소 자연수
        for(int num : nums){
            if(num > target) break;
            target += num;
        }

        System.out.println(target);
    }
}
