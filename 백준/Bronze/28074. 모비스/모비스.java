import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String mo = sc.next();
        int []arr = new int[5];
        for(int i = 0; i < mo.length(); i++){
            if(mo.charAt(i) == 'M'){
                arr[0] = 1;
            }
            else if(mo.charAt(i) == 'O'){
                arr[1] = 1;
            }
            else if(mo.charAt(i) == 'B'){
                arr[2] = 1;
            }
            else if(mo.charAt(i) == 'I'){
                arr[3] = 1;
            }
            else if(mo.charAt(i) == 'S'){
                arr[4] = 1;
            }
        }
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
