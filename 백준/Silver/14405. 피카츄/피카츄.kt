fun main(){
    var S = readln()
    var i = 0
    while(i < S.length){
        if(S[i] == 'p'){
            if(i+1 < S.length && S[i+1] == 'i'){
                i += 2
            }
            else{
                println("NO")
                System.exit(0)
            }
        }
        else if(S[i] == 'k'){
            if(i+1 < S.length && S[i+1] == 'a'){
                i += 2
            }
            else{
                println("NO")
                System.exit(0)
            }

        }
        else if(S[i] == 'c'){
            if(i+2 < S.length && S[i+1] == 'h' && S[i+2] == 'u'){
                i += 3
            }
            else{
                println("NO")
                System.exit(0)
            }
        }
        else{
            println("NO")
            System.exit(0)
        }
    }
    println("YES")

}