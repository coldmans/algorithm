import java.util.Arrays
import java.util.Scanner


val set = mutableSetOf<Int>()

fun main(){

    var input = Scanner(System.`in`)
    var n = input.nextInt()
    var k = input.nextInt()
    var li = mutableListOf<Int>()
    var visited: Array<Int> = Array<Int>(n){0}
    var tmp = mutableListOf<Int>()


    for(i in 0 until n){
        li.add(input.nextInt())
    }

    recur(li, visited, k, tmp)
    println(set.size)

}


fun recur(li: MutableList<Int>, visited : Array<Int>, k : Int, tmp : MutableList<Int>) {
    if(tmp.size == k){
        var sb = StringBuilder()
        for(i in 0 .. tmp.size-1){
            sb.append(tmp[i].toString())
        }
        set.add(sb.toString().toInt())
        return
    }
    for(i in 0 .. li.size-1){
        if(visited[i] == 1){
            continue
        }
        visited[i] = 1
        tmp.add(li[i])
        recur(li,visited, k,tmp)
        tmp.removeLast()
        visited[i] = 0

    }
}
