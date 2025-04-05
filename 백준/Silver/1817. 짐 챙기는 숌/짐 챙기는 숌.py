import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
if N == 0:
    print(0)
    sys.exit()
li = list(map(int, input().strip().split()))

tmp = M
ctt = 1
for i in range(len(li)):
    if li[i] <= tmp:
        tmp -= li[i]
    else:
        tmp = M
        tmp -= li[i]
        ctt += 1

print(ctt)