fun main(){
    var res = readln().toInt()
    while(true){
        var y = readln()
        if(y == "=") break
        var x = readln().toInt()
        if(y == "+") res += x
        else if(y == "-") res -= x
        else if(y == "*") res *= x
        else {
            res /= x
        }


    }
    println(res)
}