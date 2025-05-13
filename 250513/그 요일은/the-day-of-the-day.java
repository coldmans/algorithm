import java.util.*;
public class Main{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        int[]md={0,31,29,31,30,31,30,31,31,30,31,30,31};
        int m1=s.nextInt(),d1=s.nextInt(),m2=s.nextInt(),d2=s.nextInt();
        String[]days={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String A=s.next();
        int start=0,end=0;
        for(int i=1;i<m1;i++)start+=md[i];
        for(int i=1;i<m2;i++)end+=md[i];
        start+=d1; end+=d2;
        int diff=end-start+1;
        int idx=0;
        for(;!days[idx].equals(A);idx++);
        int first=(7-((start-1+idx)%7))%7+1;
        int cnt=(diff-first)/7+((diff>=first)?1:0);
        System.out.print(cnt);
    }
}
