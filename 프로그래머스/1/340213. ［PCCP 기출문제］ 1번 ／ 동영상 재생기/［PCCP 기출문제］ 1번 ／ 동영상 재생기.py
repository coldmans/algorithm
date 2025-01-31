def solution(video_len, pos, op_start, op_end, commands):
    pmm, pss = pos.split(":")
    opsm, opss = op_start.split(":")
    opem, opes = op_end.split(":")
    vm, vs = video_len.split(":")
    
    ps = int(pmm) * 60 + int(pss)
    ops = int(opsm) * 60 + int(opss)
    ope = int(opem) * 60 + int(opes)
    v = int(vm) * 60 + int(vs)
    
    if ps <= ope and ps >= ops:
        ps = ope
    
    for i in commands:
        if i == "prev":
            if ps < 10:
                ps = 0
            else:
                ps -= 10
                        
        elif i == "next":
            if ps + 10 > v:
                ps = v
            else:
                ps += 10
        if ps <= ope and ps >= ops:
            ps = ope
            
                
        pm = ps // 60
        pms = ps - pm * 60
        
        if pm < 10:
            pm = "0" +str(pm)
        else:
            pm = str(pm)
        
        if pms < 10:
            pms = "0" +str(pms)
        else:
            pms = str(pms)

            
        
    answer = pm +":"+ pms
    return answer