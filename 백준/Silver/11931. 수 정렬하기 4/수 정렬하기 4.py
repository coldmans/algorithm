import sys
input = sys.stdin.readline

N = int(input().strip())
tmp = []
for _ in range(N):
    tmp.append(int(input().strip()))
tmp.sort(reverse = True)
for i in tmp:
    print(i)