import sys
input = sys.stdin.readline

a,b = map(int, input().strip().split())
if a > b:
    tmp = a
    a = b
    b = tmp
elif a == b:
    print(0)
    sys.exit()
print(b-a-1)
for i in range(a+1, b):
    print(i, end = " ")

