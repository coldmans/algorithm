import sys
input = sys.stdin.readline

N = int(input().strip())
maxi = 0
ttmp = []
for i in range(N+1):
    tmp = []
    tmp.append(N)
    tmp.append(i)
    while 1:
        if tmp[-2] - tmp[-1] < 0:
            maxi = max(maxi, len(tmp))
            if len(tmp) == maxi:
                ttmp = tmp
            break
        tmp.append(tmp[-2] - tmp[-1])


print(maxi)
print(*ttmp)