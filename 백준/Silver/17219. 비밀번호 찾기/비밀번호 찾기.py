import sys
input = sys.stdin.readline
write = sys.stdout.write

N, M = map(int, input().strip().split())
tmp = {}
for _ in range(N):
    a, b = input().strip().split()
    tmp[a] = b

output = []
for _ in range(M):
    a = input().strip()
    if a in tmp:
        output.append(tmp[a] + '\n')

write(''.join(output))