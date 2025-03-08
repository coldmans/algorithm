import sys
input = sys.stdin.readline

A,B = map(int, input().strip().split())
N = int(input().strip())
li = []
for _ in range(N):
    li.append(int(input().strip()))

tmp = abs(A-B)-1
for i in range(len(li)):
    tmp = min(tmp, abs(B-li[i]))

print(tmp+1)

