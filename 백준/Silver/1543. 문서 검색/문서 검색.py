import sys
input = sys.stdin.readline

ori = [x for x in input().strip()]

search = [x for x in input().strip()]
ctt = 0
i = 0
while i < len(ori):
    if ori[i] == search[0]:
        g = 0
        for x in range(1,len(search)):
            if i + x >= len(ori):
                g = 1
                break
            if ori[i+x] != search[x]:
                g = 1
                break
        if g == 0:
            ctt += 1
            i = i + len(search)
        else:
            i += 1
    else:
        i += 1
        


print(ctt)