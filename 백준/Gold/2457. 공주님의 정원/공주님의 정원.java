import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    static int cal(int tmp){
        int res = 0;
        for(int i = 2; i <= tmp; i++){
            if(i == 3){
                res += 28;
            }
            else if(i == 5 || i == 7 || i == 10 || i == 12){
                res += 30;
            }
            else{
                res += 31;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int flower = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < flower; i++){
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int oneDay = Integer.parseInt(st.nextToken());
            int day = oneDay + cal(one);
            int two = Integer.parseInt(st.nextToken());
            int twoDay = Integer.parseInt(st.nextToken());
            int day2 = twoDay + cal(two);
            list.add(new int[]{day, day2});
        }

        Collections.sort(list, (a,b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });



        int start = 60;

        int count = 0;
        int idx = 0;
        final int TARGET = 335; // 11월 30일을 포함하려면 12월 1일(335)까지 커버되어야 함
        while(start < TARGET) {
            int maxEnd = start;

            while(idx < flower && list.get(idx)[0] <= start) {
                if(list.get(idx)[1] > maxEnd) {
                    maxEnd = list.get(idx)[1];
                }
                idx++;
            }

            if(maxEnd == start) break;


            start = maxEnd;
            count++;
        }

        if(start < TARGET){
            System.out.println(0);

        }
        else{
            System.out.println(count);
        }



    }
}
