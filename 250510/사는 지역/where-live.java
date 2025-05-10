import java.util.Scanner;

class info{
    String name;
    String bunzi;
    String region;
    info(String name, String bunzi, String region){
        this.name = name;
        this.bunzi = bunzi;
        this.region = region;
    }
    void show(){
        System.out.println("name " + name);
        System.out.println("addr " + bunzi);
        System.out.println("city " + region);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        info[] infos = new info[n];
        for(int i = 0; i < n; i++){
            infos[i] = new info(names[i], addresses[i], regions[i]);
        }
        String tmp = "a";
        for(int i = 0; i< n; i++){
            if(tmp.compareTo(names[i]) < 0){
                tmp = names[i];
            }
        }
        for(int i =0; i < n; i++){
            if(tmp.equals(infos[i].name)){
                infos[i].show();
            }
        }
    }
}