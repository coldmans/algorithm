import sys
input = sys.stdin.readline

N = int(input().strip())
li = [int(x) for x in input().strip().split()]

li.sort(reverse = True)
for i in range(len(li)):
    li[i] += i + 1
    

print(max(li)+1)