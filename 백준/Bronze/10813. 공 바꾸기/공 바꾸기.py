import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
bags = [int(x) for x in range(1,N+1)]

for _ in range(M):
    A,B = map(int, input().strip().split())
    tmp = bags[A-1]
    bags[A-1] = bags[B-1]
    bags[B-1] = tmp

print(' '.join(map(str,bags)))
