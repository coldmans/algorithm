import sys
input = sys.stdin.readline

tmp = []
ctt = 0
N = int(input().strip())
for _ in range(N):
    tmp.append(int(input().strip()))

for i in range(N-2, -1, -1):
    if tmp[i] >= tmp[i+1]:
        ctt += (tmp[i] - tmp[i+1] + 1)
        tmp[i] -= (tmp[i] - tmp[i+1] + 1)
        
        

print(ctt)




