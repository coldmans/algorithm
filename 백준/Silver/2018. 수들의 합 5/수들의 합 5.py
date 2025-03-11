import sys
input = sys.stdin.readline

N = int(input().strip())
i = 1
j = 1
ctt = 0
tmp = 1

while i <= j:
    if tmp == N:
        ctt += 1
        i += 1
        tmp -= (i-1)
    elif tmp > N:
        i += 1
        tmp -= (i-1)
    elif tmp < N:
        j += 1
        tmp += j
    
print(ctt)





        



