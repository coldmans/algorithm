import sys
import math
input = sys.stdin.readline

N = input().strip()
nums = [0 for _ in range(10)]
ctt = 0
for i in N:
    if int(i) == 6 or int(i) == 9:
        ctt += 1
    else:
        nums[int(i)] += 1

print(max(math.ceil(ctt/2), max(nums)))





