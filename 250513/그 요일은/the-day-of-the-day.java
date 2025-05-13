import java.util.*;
public class Main{
    public static void main(String[]a){
        int[]md={0,31,29,31,30,31,30,31,31,30,31,30,31};
        Scanner s=new Scanner(System.in);
        int m1=s.nextInt(),d1=s.nextInt(),m2=s.nextInt(),d2=s.nextInt();
        String[]w={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String A=s.next();
        int st=0,ed=0;
        for(int i=1;i<m1;i++)st+=md[i];
        for(int i=1;i<m2;i++)ed+=md[i];
        st+=d1; ed+=d2;
        int idx=0;
        while(!w[idx].equals(A))idx++;
        int cnt=0;
        for(int i=st;i<=ed;i++)if((i-1)%7==idx)cnt++;
        System.out.print(cnt);
    }
}
