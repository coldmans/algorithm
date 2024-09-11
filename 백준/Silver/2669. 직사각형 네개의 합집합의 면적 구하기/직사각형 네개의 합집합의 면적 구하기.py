import sys
input = sys.stdin.readline

dist = [[0 for _ in range(101)] for _ in range(101)]
maxi = 0
for _ in range(4):
    x,y,x1,y1 = map(int, input().strip().split())
    maxi = max(x1,y1,maxi)
    for i in range(y,y1):
        for j in range(x,x1):
            dist[i][j] = 1
            
ctt = 0

for i in range(maxi):
    for j in range(maxi):
        if dist[i][j] == 1:
            ctt += 1

print(ctt)