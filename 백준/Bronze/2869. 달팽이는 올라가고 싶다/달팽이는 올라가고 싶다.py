import sys
input = sys.stdin.readline

A,B,V = map(int, input().strip().split())

tmp = V-A
day = 1

res = tmp // (A-B)
if tmp % (A-B) != 0:
    day += 1

print(res + day)

        

