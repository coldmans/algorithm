import sys
input = sys.stdin.readline

def dfs(n):
    global ctt
    if n == N:
        ctt += 1
        return

    for j in range(N):
        if v1[j] == v2[n+j] == v3[n-j] == 0:
            v1[j] = v2[n+j] = v3[n-j] = 1
            dfs(n+1)
            v1[j] = v2[n+j] = v3[n-j] = 0

N = int(input().strip())
ctt = 0

v1 = [0] * N
v2 = [0] * (2*N)
v3 = [0] * (2*N)

dfs(0)
print(ctt)