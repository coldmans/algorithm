import sys
input = sys.stdin.readline

text = input().strip()

i = 0
stack = []
while 1:
    if i == len(text)-1:
        print(text[-1], end = "")
        while stack:
            print(stack.pop(),end ="")
        break
    elif text[i] == "<":
        while stack:
            print(stack.pop(), end = "")
        while 1:
            if text[i] == ">":
                print(">",end = "")
                if i == len(text)-1:
                    sys.exit()
                i+=1
                break
            else:
                print(text[i], end = "")
                i += 1
    elif text[i] == " ":
        while stack:
            print(stack.pop(),end ="")
        print(" ",end = "")
        i += 1
        
    else:
        stack.append(text[i])
        i += 1

