import sys
input = sys.stdin.readline

A,B = map(str, input().strip().split())

if int(A[::-1]) > int(B[::-1]):
    print(int(A[::-1]))
else:
    print(int(B[::-1])) 
