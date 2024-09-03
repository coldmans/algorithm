import sys
input = sys.stdin.readline

N = int(input().strip())
tmp = []
for _ in range(N):
    kg,cm = map(int, input().strip().split())
    tmp.append((kg,cm))

stack = [1] * (N)

for i in range(N):
    for j in range(N):
        if i == j:
            continue
        if tmp[i][0] < tmp[j][0] and tmp[i][1] < tmp[j][1]:
            stack[i] += 1

print(' '.join(map(str,stack)))
        



            

