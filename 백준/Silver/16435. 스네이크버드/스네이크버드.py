import sys
input = sys.stdin.readline

N,L = map(int, input().strip().split())

fruit = [int(x) for x in input().strip().split()]
fruit.sort()

for i in range(len(fruit)):
    if fruit[i] <= L:
        L += 1
    else:
        break
print(L)





