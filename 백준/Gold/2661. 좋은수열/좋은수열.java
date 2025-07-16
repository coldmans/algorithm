import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    static int N;
    static void dfs(String current){
        if(current.length() == N){
            System.out.println(current);
            System.exit(0);
        }
        for(int i = 1; i <= 3; i++){
            String next = current + i;
            if(!isBad(next)){
                dfs(next);
            }
        }
    }

    static boolean isBad(String line){
        for(int i = 1; i <= line.length() / 2; i++){
            String a = "";
            String b = "";
            for(int j = line.length() - 1; j >= line.length() - i; j--){
                a += line.charAt(j);
            }
            for(int j = line.length() - i - 1; j >= line.length() - (i*2); j--){
                b += line.charAt(j);
            }
            if(a.equals(b)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dfs("");
    }
}