import sys
input = sys.stdin.readline

N = int(input().strip())
day = [0 for _ in range(366)]
for _ in range(N):
    s,e = map(int, input().strip().split())
    for i in range(s,e+1):
        day[i] += 1
res = 0
tmp = 0
maxi = 0
for i in range(len(day)):
    if day[i] > 0:
        tmp += 1
        maxi = max(maxi,day[i])
    else:
        if tmp != 0:
            res += maxi * tmp
            maxi = 0
            tmp = 0
if tmp != 0:
    res += tmp * maxi


print(res)