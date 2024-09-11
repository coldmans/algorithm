import sys
input = sys.stdin.readline

def era():
    li = [True] * 1000001
    li[0], li[1] = False, False
    end = int(1000000 ** 0.5)
    for i in range(2, end + 1):
        if li[i]:
            for j in range(i * i, 1000001, i):
                li[j] = False
    return [i for i in range(2, 1000001) if li[i]]

def gogo(v):
    ctt = 0
    for prime in eras:
        if prime > v // 2:
            break
        if (v - prime) in prime_set:
            ctt += 1
    return ctt

eras = era()
prime_set = set(eras)
N = int(input().strip())

for _ in range(N):
    x = int(input().strip())
    print(gogo(x))