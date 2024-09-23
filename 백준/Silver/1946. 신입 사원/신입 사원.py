import sys
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    mem = int(input().strip())
    sin = []
    ctt = 1
    for _ in range(mem):
        s,m = map(int ,input().strip().split())
        sin.append((s,m))
    sin.sort(key = lambda x: (x[0],x[1]))
    maxim = sin[0][1]
    for i in range(1,mem):
        if sin[i][1] < maxim:
            maxim = sin[i][1]
            ctt += 1
    print(ctt)


