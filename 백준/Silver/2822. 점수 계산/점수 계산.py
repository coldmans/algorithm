import sys
input = sys.stdin.readline
li = []
for i in range(1,9):
    li.append((int(input().strip()), i))
li.sort(reverse = True)
for _ in range(3):
    li.pop()
li.sort(key=lambda x : x[1])
res = 0
for i,j in li:
    res += i
print(res)
for i,j in li:
    print(j, end = " ")






