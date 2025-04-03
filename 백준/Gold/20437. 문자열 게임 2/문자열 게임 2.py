import sys
input = sys.stdin.readline



test = int(input().strip())
for _ in range(test):
    mins = 1e9
    maxi = -1

    li = [[] for _ in range(26)]
    mun = input().strip()
    N = int(input().strip())
    for i in range(len(mun)):
        li[ord(mun[i])-97].append(i)
    for k in range(len(li)):
        if len(li[k]) < N:
            continue
        i = 0
        j = N-1

        while j < len(li[k]):
            if li[k][j]-li[k][i] < mins:
                mins = li[k][j] - li[k][i]
            if li[k][j] - li[k][i] > maxi:
                maxi = li[k][j] - li[k][i]
            i += 1
            j += 1
    mins += 1
    maxi += 1

    if maxi == 0:
        print(-1)
    else:
        print(mins, maxi)


