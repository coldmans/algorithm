class Solution
{
    public int solution(int n, int a, int b)
    {
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int ctt = 1;
        
        while(true){
            if(b - 1 == a && a % 2 == 1) break;
            ctt += 1;
            
            if(a % 2 == 1){
                a += 1;
            }
            a /= 2;
            
            if(b % 2 == 1){
                b += 1;
            }
            b /= 2;
        }
        

        return ctt;
    }
}