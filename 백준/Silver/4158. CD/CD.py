import sys
input = sys.stdin.readline

while 1:
    N, M = map(int, input().strip().split())
    if N == 0 and M == 0:
        break
    cdn = set()
    ctt = 0
    for _ in range(N+M):
        cd = int(input().strip())
        if cd in cdn:
            ctt += 1
        else:
            cdn.add(cd)
    print(ctt)




