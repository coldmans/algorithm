import sys
input = sys.stdin.readline
stu = []
k = int(input().strip())
for _ in range(k):
    stu.append(input().strip()[::-1])
n = len(stu[0])

res = set()
for i in range(0,n):
    for j in stu:
        if j[:i] in res:
            break
        else:
            res.add(j[:i])
            if len(res) == k:
                print(i)
                sys.exit()  
    res = set()  
print(n)







         