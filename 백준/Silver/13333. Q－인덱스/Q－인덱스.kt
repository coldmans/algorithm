import java.util.Arrays
import java.util.Scanner

fun main(){
    var input = Scanner(System.`in`)
    var k = input.nextInt()
    var li = mutableListOf<Int>()
    for(i in 0..k-1){
        li.add(input.nextInt())
    }
    li.sort()
    if(li[k-1] == 0){
        println(0)
        System.exit(0)
    }
    for(i in 1..k-1){
        var isgood = false
        if(li[k-i] >= i){
            if((k-i > 0 && li[k-i-1] <= i)){
                isgood = true
            }
        }
        if(isgood){
            println(i)
            System.exit(0)
        }
    }
    println(k)

}
