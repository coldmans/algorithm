import sys
input = sys.stdin.readline

n = int(input().strip())
li = [int(x) for x in input().strip().split()]
li.sort()
i = 0
j = len(li)-1
tmp = 2000000002
if n == 2:
    x = li[0]
    y = li[1]
while i<j:
    if (li[i] + li[j]) < 0:
        tmp = min(tmp, -(li[i]+li[j]))
        if tmp == -(li[i] + li[j]):
            x = li[i]
            y = li[j]
        i += 1
    else:
        tmp = min(tmp,(li[i]+li[j]))
        if tmp == (li[i] + li[j]):
            x = li[i]
            y = li[j]
        j -= 1

print(x,y)


        




