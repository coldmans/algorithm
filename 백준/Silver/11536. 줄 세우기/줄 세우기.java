import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<String> originalList = new ArrayList<>();
        List<String> increaseList = new ArrayList<>();
        List<String> decreaseList = new ArrayList<>();
        for(int i = 0; i < N; i++){
            String tmp = br.readLine();
            originalList.add(tmp);
            increaseList.add(tmp);
            decreaseList.add(tmp);
        }

        Collections.sort(increaseList);
        Collections.sort(decreaseList, Collections.reverseOrder());
        boolean inTrue = true;
        boolean deTrue = true;
        for(int i = 0; i < N; i++){
            if(originalList.get(i).equals(increaseList.get(i))){

            }
            else{
                inTrue = false;
            }

            if(originalList.get(i).equals(decreaseList.get(i))){

            }
            else{
                deTrue = false;
            }
        }
        if(inTrue){
            System.out.println("INCREASING");
        }
        else if(deTrue){
            System.out.println("DECREASING");
        }
        else{
            System.out.println("NEITHER");
        }



    }
}