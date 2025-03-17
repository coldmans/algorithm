import sys
input = sys.stdin.readline

N = int(input().strip())
li = list(map(int, input().strip().split()))

i = 0
j = len(li) - 1
ii = 0
jj = len(li) - 1
mini = abs(li[0] + li[-1])
while i < j:
    if i + 1 < j:
        if abs(li[i+1] + li[j]) < abs(li[i] + li[j-1]):
            i += 1
        else:
            j -= 1
    if abs(li[i]+li[j]) <= mini:
        mini = abs(li[i]+li[j])
        ii = i
        jj = j
    if i + 1 == j:
        break

print(li[ii],li[jj])
