import sys
input = sys.stdin.readline

def diar(x):
    if x in ("A" , "B" , "C"):
        return 3
    elif x in ("D","E","F"):
        return 4
    elif x in ("G","H","I"):
        return 5
    elif x in ("J","K","L"):
        return 6
    elif x in ("M","N","O"):
        return 7
    elif x in ("P","Q","R","S"):
        return 8
    elif x in ("T","U","V"):
        return 9
    elif x in ("W","X","Y","Z"):
        return 10

test = input().strip()
res = 0
for i in test:
    res += diar(i)

print(res)