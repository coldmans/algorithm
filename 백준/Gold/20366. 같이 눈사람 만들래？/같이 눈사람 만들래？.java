import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }

        List<Snowman> snowmen = new ArrayList<>();

        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                snowmen.add(new Snowman(i, j, (long)H[i]+H[j]));
            }
        }
        Collections.sort(snowmen);

        Long minDiff = Long.MAX_VALUE;

        for(int i = 0; i < snowmen.size(); i++){
            for(int j = i + 1; j < snowmen.size(); j++){
                Snowman s1 = snowmen.get(i);
                Snowman s2 = snowmen.get(j);

                if(s1.idx1 != s2.idx1 && s1.idx1 != s2.idx2 && s1.idx2 != s2.idx1 && s1.idx2 != s2.idx2){
                    minDiff = Math.min(minDiff, Math.abs(s1.height - s2.height));
                    break;
                }
            }
        }

        System.out.println(minDiff);

    }

    static class Snowman implements Comparable<Snowman>{
        int idx1;
        int idx2;
        Long height;

        public Snowman(int idx1, int idx2, Long height){
            this.idx1 = idx1;
            this.idx2 = idx2;
            this.height = height;
        }


        @Override
        public int compareTo(Snowman o) {
            return Long.compare(this.height, o.height);
        }
    }

}



