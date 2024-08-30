import sys
input = sys.stdin.readline

gab = int(input().strip())
switch = [int(x) for x in input().strip().split()]

student = int(input().strip())
for _ in range(student):
    x,y = map(int,input().strip().split())
    if x == 1:
        for i in range(1,gab+1):
            if i % y == 0:
                if switch[i-1] == 0:
                    switch[i-1] = 1
                else:
                    switch[i-1] = 0
    else:
        i = 0
        while (y-i > 0) and (y+i <= gab):
            if switch[y-1-i] == switch[y-1+i]:
                if switch[y-1-i] == 1:
                    switch[y-1-i] = 0
                    switch[y-1+i] = 0
                else:
                    switch[y-1-i] = 1
                    switch[y-1+i] = 1
            else:
                break
            i += 1
ctt = 0
for i in range(gab):
    print(switch[i], end = " ")
    ctt += 1
    if ctt == 20:
        print()
        ctt = 0



    



    