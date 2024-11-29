import sys
input = sys.stdin.readline

a = input().strip()
li = []
for i in range(len(a)):
    li.append(int(a[i]))
li.sort(reverse = True)
print(''.join(map(str,li)))

