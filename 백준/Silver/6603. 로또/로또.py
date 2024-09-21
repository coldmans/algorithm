import sys
input = sys.stdin.readline

def recur(lotto, tmp, i, ctt):
    if ctt == 6:
        print(' '.join(map(str, tmp)))
        return
    if i >= len(lotto):
        return
    tmp.append(lotto[i])
    ctt += 1
    recur(lotto, tmp, i + 1, ctt)
    tmp.pop()  # tmp에서 요소를 제거하여 원래 상태로 되돌림
    ctt -= 1
    recur(lotto, tmp, i + 1, ctt)

while True:
    lotto = list(map(int, input().strip().split()))
    if lotto[0] == 0:
        break
    
    k = lotto[0]
    tmp = []
    recur(lotto[1:], tmp, 0, 0)  # lotto[1:]로 첫 번째 숫자(k)를 제외한 리스트 전달
    print()