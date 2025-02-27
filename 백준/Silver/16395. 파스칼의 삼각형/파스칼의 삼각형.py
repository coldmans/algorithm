import sys
input = sys.stdin.readline

n,k = map(int, input().strip().split())
ans = [[] for _ in range(n+1)]

ans[0].append(1)

for i in range(1,n):
    for j in range(i+1):
        if j == 0 or i == j:
            ans[i].append(1)
        else:
            ans[i].append(ans[i-1][j-1] + ans[i-1][j])

print(ans[n-1][k-1])


