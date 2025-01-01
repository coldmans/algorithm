import sys
input = sys.stdin.readline

a,b = map(int, input().strip().split())
li = []
for i in range(a,b+1):
    i = str(i)
    if i[0] == "1":
        s = "one"
    elif i[0] == "2":
        s = "two"
    elif i[0] == "3":
        s = "three"
    elif i[0] == "4":
        s = "four"
    elif i[0] == "5":
        s = "five"
    elif i[0] == "6":
        s = "six"
    elif i[0] == "7":
        s = "seven"
    elif i[0] == "8":
        s = "eight"
    elif i[0] == "9":
        s = "nine"
    if len(i) == 2:
        if i[1] == "1":
            t = "one"
        elif i[1] == "2":
            t = "two"
        elif i[1] == "3":
            t = "three"
        elif i[1] == "4":
            t = "four"
        elif i[1] == "5":
            t = "five"
        elif i[1] == "6":
            t = "six"
        elif i[1] == "7":
            t = "seven"
        elif i[1] == "8":
            t = "eight"
        elif i[1] == "9":
            t = "nine"
        elif i[1] == "0":
            t = "zero" 
        li.append(' '.join((s,t)))

    else:
        li.append(s)
    
li.sort()    
lili = []
for i in range(len(li)):

    if li[i] == "one":
        lili.append(1)
    elif li[i] == "two":
        lili.append(2)
    elif li[i] == "three":
        lili.append(3)
    elif li[i] == "four":
        lili.append(4)
    elif li[i] == "five":
        lili.append(5)
    elif li[i] == "six":
        lili.append(6)
    elif li[i] == "seven":
        lili.append(7)
    elif li[i] == "eight":
        lili.append(8)
    elif li[i] == "nine":
        lili.append(9)
    
    else:
        a,b = li[i].split(" ")
        if a == "one":
            s = 1
        elif a == "two":
            s = 2
        elif a == "three":
            s = 3
        elif a == "four":
            s = 4
        elif a == "five":
            s = 5
        elif a == "six":
            s = 6
        elif a == "seven":
            s = 7
        elif a == "eight":
            s = 8
        elif a == "nine":
            s = 9
        
        if b == "one":
            t = 1
        elif b == "two":
            t = 2
        elif b == "three":
            t = 3
        elif b == "four":
            t = 4
        elif b == "five":
            t = 5
        elif b == "six":
            t = 6
        elif b == "seven":
            t = 7
        elif b == "eight":
            t = 8
        elif b == "nine":
            t = 9
        elif b == "zero":
            t = 0
        
        lili.append(s*10+t)
        
for i in range(len(lili)):
    if (i + 1)  % 10 == 0:
        print(lili[i])
        continue
    print(lili[i], end = " ")

    

    

    

    
        









