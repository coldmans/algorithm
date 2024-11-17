import sys
from math import comb
input = sys.stdin.readline

N = int(input().strip())
result = comb(N, 4)
print(result)
