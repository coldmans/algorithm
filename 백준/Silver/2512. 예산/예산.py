import sys

N = int(input().strip())
li = list(map(int, input().strip().split()))
total = int(input().strip())

if sum(li) <= total:
    print(max(li))
    sys.exit()

i = 1
j = max(li)
m = 0
while i <= j:
    m = (i + j)//2 
    tmp = 0
    for k in li:
        if k < m:
            tmp += k
        else:
            tmp += m
    if total == tmp:
        print(m)
        sys.exit()
    elif total < tmp:
        m -= 1
        j = m
    else:
        m += 1
        i = m 


print(j)



