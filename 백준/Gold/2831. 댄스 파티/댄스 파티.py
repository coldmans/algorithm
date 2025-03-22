import sys
input = sys.stdin.readline

N = int(input().strip())
man = list(map(int, input().strip().split()))
wom = list(map(int, input().strip().split()))
man.sort()
wom.sort()
i = 0
j = N-1
tmp = 0
while i < N and j >= 0:
    if man[i] < 0:
        if wom[j] > 0:
            if man[i] + wom[j] >= 0:
                j -= 1
            else:
                tmp += 1
                i += 1
                j -= 1
        else:
            i += 1
    else:
        if wom[j] > 0 :
            j -= 1
        else:
            if man[i] + wom[j] < 0:
                tmp += 1
                i += 1
                j -= 1
            else:
                j -= 1

print(tmp)



