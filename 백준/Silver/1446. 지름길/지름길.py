import sys
input = sys.stdin.readline

def recur(s,t,r):
    global l, legend
    if t == l:
        legend.append((s,r))
        return

    if tmp[t][0] >= r:
        tm = 0
        if tmp[t][0] > r:
            tm = tmp[t][0] - r
        recur(s+tm+tmp[t][2], t+1, tmp[t][1])
    
    recur(s, t+1, r)

tmp = []
N, D = map(int, input().strip().split())
for _ in range(N):
    s,l,d = map(int, input().strip().split())
    if l - s <= d or l > D:
        continue
    tmp.append((s,l,d))
l = len(tmp)
legend = []
tmp.sort()
recur(0,0,0)
maxi = 1e9

for i,j in legend:

    if j < D:
        maxi = min(maxi, i + (D-j))
    else:
        maxi = min(maxi, i)

print(maxi)

