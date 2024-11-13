import sys
input = sys.stdin.readline

n = int(input().strip())
podo = []
for _ in range(n):
    podo.append(int(input().strip()))

dp = [(0,0) for _ in range(n+1)]
dp[1] = (podo[0],podo[0])
a = 0

for i in range(2,n+1):
    x = 0
    for j in range(i-1):
        x = max(x, dp[j][0],dp[j][1])
    dp[i] = (x + podo[i-1], dp[i-1][0] + podo[i-1])  
    a = max(dp[i][0], dp[i][1], a)
if n == 1:
    print(podo[0])
else:
    print(a)
   

    






    







    





