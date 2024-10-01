import sys
input = sys.stdin.readline

a, b= map(int, input().strip().split())
x, y = map(int, input().strip().split())

if a == 0:
    if x == 0 and y < b:
        print(3)
    else:
        print(1)

elif b == 0:
    if y == 0 and x < a:
        print(3)
    else:
        print(1)
else:
    print(2)