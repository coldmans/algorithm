import sys
from collections import deque
input = sys.stdin.readline
maxi = -1000000001
mini = 1000000001
def recur(li,yun,tmp):
    global maxi,mini
    if len(li) == 0:
        maxi = max(maxi, tmp)
        mini = min(mini, tmp)
        return
    if yun[0] != 0:
        yun[0] -= 1
        t = li.popleft()
        recur(li, yun, tmp+t)
        yun[0] += 1
        li.appendleft(t)
    if yun[1] != 0:
        yun[1] -= 1
        t = li.popleft()
        recur(li, yun, tmp-t)
        yun[1] += 1
        li.appendleft(t)
    if yun[2] != 0:
        yun[2] -= 1
        t = li.popleft()
        recur(li, yun, tmp*t)
        yun[2] += 1
        li.appendleft(t)
    if yun[3] != 0:
        yun[3] -= 1
        t = li.popleft()
        if t != 0:
            if tmp < 0:
                recur(li, yun, -(-tmp // t))
            else:
                recur(li, yun, tmp // t)
        yun[3] += 1
        li.appendleft(t)



N = int(input().strip())
li = deque(map(int, input().strip().split()))
yun = list(map(int, input().strip().split()))

initial_value = li.popleft()
recur(li, yun, initial_value)

print(maxi)
print(mini)









   

    






    







    





