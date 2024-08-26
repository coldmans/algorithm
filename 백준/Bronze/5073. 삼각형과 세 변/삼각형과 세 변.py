import sys
input = sys.stdin.readline

while 1:
    x = list(map(int ,input().strip().split()))
    if x[0] == 0 and x[1] == 0 and x[2] == 0:
        break
    x.sort()
    if x[2] >= x[0] + x[1]:
        print("Invalid")
    elif x[0] == x[1] == x[2]:
        print("Equilateral")
    elif x[0] != x[1] and x[0] != x[1] and x[1] != x[2]:
        print("Scalene")
    else:
        print("Isosceles")



    