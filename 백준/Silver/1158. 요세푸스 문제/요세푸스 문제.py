import sys
input = sys.stdin.readline

n,k = map(int,input().strip().split())

tmp = [int(x) for x in range(1,n+1)]

i = k-1
print("<", end = "")
ctt = 0
while tmp:
    ctt += 1
    if ctt == n:
        print(tmp[i],end = "")
        break
    print(tmp[i],end = ", ")
    del tmp[i]
    i += k-1
    while i >= len(tmp):
        i -= len(tmp)
print(">")





