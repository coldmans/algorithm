import sys
input = sys.stdin.readline

n = int(input().strip())
if n % 3 == 1:
    print("U")
elif n % 3 == 2:
    print("O")
else:
    print("S")


