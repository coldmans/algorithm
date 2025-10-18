fun main(){
    while(true){
        val line = readLine() ?: break
        val lowercase = line.count{ it.isLowerCase() }
        val uppercase = line.count{ it.isUpperCase() }
        val digits = line.count{it.isDigit()}
        val space = line.count{it == ' '}

        println("$lowercase $uppercase $digits $space")
    }
}