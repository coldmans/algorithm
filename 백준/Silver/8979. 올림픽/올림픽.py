import sys
input = sys.stdin.readline

N, K = map(int, input().strip().split())
me = []
for _ in range(N):
    n,g,e,d = map(int, input().strip().split())
    me.append((n,g,e,d))
me.sort(key = lambda x : (x[1],x[2],x[3]),reverse=True)
rank = 1
ranks = 0
tmp = [me[0][1],me[0][2],me[0][3]]

for i in range(1,N):
    n,g,e,d = me[i]
    if tmp[0] == g and tmp[1] == e and tmp[2] == d:
        ranks += 1
    else:
        rank += ranks + 1
        ranks = 0
    tmp[0] = g
    tmp[1] = e
    tmp[2] = d
    if n == K:
        print(rank)
        sys.exit()

print(1)










