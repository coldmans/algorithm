import sys
input = sys.stdin.readline

N = int(input().strip())
li = []
for _ in range(N):
    li.append(int(input().strip()))
li.sort(reverse=True)

for i in range(len(li)-2):
    if li[i] < li[i+1] + li[i+2]:
        print(li[i] + li[i+1] + li[i+2])
        sys.exit()
print(-1)




    