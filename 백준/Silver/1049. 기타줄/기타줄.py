import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
mins = 1e9
packs = []
nas = []
for _ in range(M):
    pack, na = map(int, input().strip().split())
    packs.append(pack)
    nas.append(na)

packs.sort()
nas.sort()
    
if N <= 6:
    if nas[0] * N >= packs[0]:
        mins = packs[0]
    else:
        mins = nas[0] * N

else:
    if nas[0] * 6 <= packs[0]:
        mins = nas[0] * N
    else:
        tmp = packs[0] * (N//6)
        tmp += min(nas[0] * (N % 6), packs[0])
        mins = tmp
print(mins)



