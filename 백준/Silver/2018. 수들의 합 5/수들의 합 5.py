import sys
input = sys.stdin.readline

N = int(input().strip())
i = 1
j = 1
ctt = 0

while i <= j:
    a = sum([i for i in range(i,j+1)])
    if a == N:
        ctt += 1
        i += 1
    elif a > N:
        i += 1
    elif a < N:
        j += 1
    
print(ctt)





        



