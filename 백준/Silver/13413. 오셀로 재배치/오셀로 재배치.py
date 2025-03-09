import sys
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    N = int(input().strip())
    li = list(input().strip())
    li2 = list(input().strip())
    b1 = li.count("B")
    b2 = li2.count("B")
    ctt = 0
    if b1 < b2:
        for i in range(len(li)):
            if b1 == b2:
                break
            if li[i] != li2[i] and li[i] == "W":
                li[i] = "B"
                ctt += 1
                b1 += 1
    if b1 > b2:
        for i in range(len(li)):
            if b1 == b2:
                break
            if li[i] != li2[i] and li[i] == "B":
                li[i] = "W"
                ctt += 1
                b1 -= 1
    if b1 == b2:
        ct = 0
        for i in range(len(li)):
            if li[i] != li2[i]:
                ct += 1
        ctt += ct//2

    print(ctt) 
            






        



