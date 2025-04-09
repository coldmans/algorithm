import sys
input = sys.stdin.readline

N = int(input().strip())
M = int(input().strip())

friends = set()

so = set()
tmp = []
for _ in range(M):
    a,b= map(int, input().strip().split())
    if a == 1:
        friends.add(b)
        so.add(b)
    elif b == 1:
        friends.add(a)
        so.add(a)
    else:
        tmp.append((a,b))

while tmp:
    a,b = tmp.pop()
    if a in friends:
        so.add(b)
    elif b in friends:
        so.add(a)


print(len(so))
