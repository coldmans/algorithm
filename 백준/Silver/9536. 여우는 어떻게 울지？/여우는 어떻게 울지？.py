import sys
input = sys.stdin.readline

T = int(input().strip())

for _ in range(T):
    say = list(input().strip().split())
    li = []
    while 1:
        sound = list(input().strip().split())
        
        if sound[0] == "what" and sound[1] == "does" and sound[2] == "the" and sound[3] == "fox" and sound[4] == "say?":
            break
        else:
            if say: 
                for i in say:
                    if i != sound[-1]:
                        li.append(i)
                say = []
            else:
                for i in li:
                    if i != sound[-1]:
                        say.append(i)
                li = []
    
    if li:
        print(*li)
    else:
        print(*say)







   


    








    



