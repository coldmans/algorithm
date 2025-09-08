
import java.util.Scanner


fun main(){
    var input = Scanner(System.`in`)
    var k = input.nextInt()
    var A = 1
    var B = 0
    for(i in 0..k-1){
        var tA = B
        var tB = A+B
        A = tA
        B = tB
    }

    println(A.toString() + " " + B.toString())
    System.exit(0)
}