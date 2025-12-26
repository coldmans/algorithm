import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String[] student = new String[n];
        Integer[][] score = new Integer[n][4];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            student[i] = st.nextToken();
            score[i][0] = i;
            score[i][1] = Integer.parseInt(st.nextToken());
            score[i][2] = Integer.parseInt(st.nextToken());
            score[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[1] == o2[1]){
                    if(o1[2] == o2[2]){
                        if(o1[3] == o2[3]){
                            return student[o1[0]].compareTo(student[o2[0]]);
                        }
                        else{
                            return o2[3] - o1[3];
                        }
                    }
                    else{
                        return o1[2] - o2[2];
                    }
                }
                else{
                    return o2[1] - o1[1];
                }
            }
        });

        for (Integer[] integers : score) {
            System.out.println(student[integers[0]]);
        }


    }
}