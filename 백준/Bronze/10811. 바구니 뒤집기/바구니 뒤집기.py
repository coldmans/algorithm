import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
go = [int(x) for x in range(1,N+1)]
for _ in range(M):
    a,b = map(int ,input().strip().split())
    while a < b:
        tmp = go[a-1]
        go[a-1] = go[b-1]
        go[b-1] = tmp
        a += 1
        b -= 1

print(' '.join(map(str,go)))
