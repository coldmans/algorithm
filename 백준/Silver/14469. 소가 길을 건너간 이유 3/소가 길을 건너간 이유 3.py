import sys
input = sys.stdin.readline

N = int(input().strip())
li = []
for _ in range(N):
    x,y = map(int, input().strip().split())
    li.append((x,y))

li.sort()
cur = 0
for i,j in li:
    if i <= cur:
        cur += j
    else:
        cur = i + j

print(cur)




