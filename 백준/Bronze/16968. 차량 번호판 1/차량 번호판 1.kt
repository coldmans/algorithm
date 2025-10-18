fun main(){
    var l = readln()
    var res = if(l[0] == 'd') 10 else 26
    for(i in 1 .. l.length -1 ){
        if(l[i] == 'd'){
            if(l[i-1] == 'd') res *= 9 else res *= 10
        }
        else{
            if(l[i-1] == 'c') res *= 25 else res *= 26
        }
    }
    println(res)
}