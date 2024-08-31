import sys
input = sys.stdin.readline

N = int(input().strip())

val = [int(x) for x in input().strip().split()]

print(min(val), max(val))