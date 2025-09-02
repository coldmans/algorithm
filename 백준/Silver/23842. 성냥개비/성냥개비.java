import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static HashMap<Integer, Integer> hashMap= new HashMap<>();

    static void recur(List<Integer> list, int tmp){
        if(tmp <= 0 && list.size() == 6){
            if(tmp == 0 && list.get(0) * 10 + list.get(1) + list.get(2) * 10 + list.get(3) == list.get(4) * 10 + list.get(5)){
                System.out.println(list.get(0) +""+ list.get(1)+ "+" + list.get(2) +""+ list.get(3) + "=" + list.get(4) +""+ list.get(5));
                System.exit(0);
            }
        }
        if(tmp <= 0 || list.size() >= 6){
            return;
        }
        int[] t = new int []{2, 3, 4, 5, 6, 7};
        for(int i = 0; i < 6; i++){
            if(t[i] == 6){
                list.add(0);
                recur(list, tmp - 6);
                list.remove(list.size()-1);

                list.add(6);
                recur(list, tmp - 6);
                list.remove(list.size()-1);
            }
            if(t[i] == 5){
                list.add(2);
                recur(list, tmp - 5);
                list.remove(list.size()-1);

                list.add(3);
                recur(list, tmp - 5);
                list.remove(list.size()-1);
            }
            list.add(hashMap.get(t[i]));
            recur(list, tmp - t[i]);
            list.remove(list.size()-1);
        }
    }


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        hashMap.put(6,0);
        hashMap.put(2,1);
        hashMap.put(5,2);
        hashMap.put(5,3);
        hashMap.put(4,4);
        hashMap.put(5,5);
        hashMap.put(6,6);
        hashMap.put(3,7);
        hashMap.put(7,8);
        hashMap.put(6,9);

        int N = Integer.parseInt(st.nextToken())-4;
        if(N < 12) {
            System.out.println("impossible");
            System.exit(0);
        }
        else{
            List<Integer> list = new ArrayList<>();
            recur(list, N);
        }
        System.out.println("impossible");


    }
}
