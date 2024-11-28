import sys
input = sys.stdin.readline

def gg(x):
    a = -1
    b = -1
    ctt = 0
    for i in range(5):
        for j in range(5):
            if bing[i][j] == x:
                bing[i][j] = 0
                a = i
                b = j
    tmp = True
    if a != -1:
        for j in range(5):
            if bing[a][j] != 0:
                tmp = False
        if tmp == True:
            ctt += 1
    tmp = True
    if b != -1:
        for j in range(5):
                if bing[j][b] != 0:
                    tmp = False
        if tmp == True:
            ctt += 1
    if a == b:
        tmp = True
        for i in range(5):
            if bing[i][i] != 0:
                tmp = False
        if tmp == True:
            ctt += 1
    if a+b == 4:
        tmp = True
        for i in range(5):
            if bing[i][4-i] != 0:
                tmp = False
        if tmp == True:
            ctt += 1
                
    return ctt
    
    



bing = [[int(x) for x in input().strip().split()] for _ in range(5)]
sa = [[int(x) for x in input().strip().split()] for _ in range(5)]
tmpp = 1
gas = 0
for i in range(5):
    for j in range(5):
        gas += gg(sa[i][j])
        if gas >= 3:
            print(tmpp)
            sys.exit()
        tmpp += 1
