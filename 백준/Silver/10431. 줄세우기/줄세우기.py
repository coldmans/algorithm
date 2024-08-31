import sys
input = sys.stdin.readline

test = int(input().strip())
result = []
for j in range(test):
    tall = list(map(int, input().strip().split()))
    orm = []
    tall.pop(0)
    res = 0
    orm.append(tall.pop(0))
    while tall:
        tmp = tall.pop(0)
        for i in range(len(orm)):
            if orm[i] > tmp:
                res += len(orm) - i
                orm.insert(i, tmp)
                break
        else:
            orm.append(tmp)
    result.append(res)

for i in range(test):
    print(i + 1, result[i])