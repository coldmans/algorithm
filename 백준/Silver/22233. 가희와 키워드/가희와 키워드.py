import sys
input = sys.stdin.readline
s = set()
N,M = map(int, input().strip().split())
for _ in range(N):
    s.add(input().strip())
for _ in range(M):
    li = list(map(str, input().strip().split(",")))
    for i in range(len(li)):
        if li[i] in s:
            s.remove(li[i])
    print(len(s))

