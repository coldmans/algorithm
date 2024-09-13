import sys
input = sys.stdin.readline
pm = [0]
sik = input().strip()
numsik = sik.replace("+","-").split("-")

for i in sik:
    if i == "-" or i == "+":
        pm.append(i)
    
stack = []
res = int(numsik[0])
for i in range(1,len(numsik)):
    if pm[i] == "-":
        while stack:
            res -= int(stack.pop())
        stack.append(numsik[i])
    else:
        if stack:
            stack.append(numsik[i])
        else:
            res += int(numsik[i])

while stack:
    res -= int(stack.pop())

print(res)