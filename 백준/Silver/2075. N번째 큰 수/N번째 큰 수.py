import sys
input = sys.stdin.readline

N = int(input().strip())
li = [[int(i) for i in input().strip().split()] for _ in range(N)]

tmp = li[-1]
tmp.sort(reverse=True)
mack = []
for j in range(N):
    for i in range(N-2,-1,-1):
        if li[i][j] > tmp[-1]:
            tmp.append(li[i][j])
            tmp.sort(reverse=True)
            tmp.pop()
        else:
            break
print(tmp[-1]) 
