import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.equals("push_back")){
                int num = sc.nextInt();
                v.add(num);
            }
            else if(str.equals("get")){
                int num = sc.nextInt()-1;
                int x = v.get(num);
                System.out.println(x);
            }
            else if(str.equals("size")){
                System.out.println(v.size());
            }
            else if(str.equals("pop_back")){
                v.remove(v.size()-1);
            }
        }
    }
}