import sys
input = sys.stdin.readline

L, R = input().strip().split()
i = len(L)-1
ctt = 0
while i != -1:
    if L[i] == '8':
        ctt += 1
        if int(L)+ 10**(len(L)-i-1) <= int(R) or R[i] == '9':
            ctt -= 1
    i -= 1


print(ctt)
