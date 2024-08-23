import sys
input = sys.stdin.readline

n = str(input().strip())
ctt = len(n)
res = 0
while ctt:
    w = 10 ** (ctt-1)
    p = int(n) - w
    res += ctt * p + 1
    ctt -= 1
    n = int(n) - p

print(res)


    