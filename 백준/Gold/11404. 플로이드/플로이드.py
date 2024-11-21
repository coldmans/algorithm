import sys
input = sys.stdin.readline

n = int(input().strip())
m = int(input().strip())
li = [[1e9 for _ in range(n)] for _ in range(n)]
for _ in range(m):
    a,b,c = map(int, input().strip().split())
    if li[a-1][b-1] > c:
        li[a-1][b-1] = c
    
for k in range(n):
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            if i == k or j == k:
                continue
            if li[i][j] > li[i][k] + li[k][j]:
                li[i][j] = li[i][k] + li[k][j]
                

for i in range(n):
    for j in range(n):
        if li[i][j] == 1e9:
            print(0, end = " ")
        else:
            print(li[i][j],end = " ")
    print()









