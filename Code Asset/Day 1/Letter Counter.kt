
fun main(args: Array<String>) {
    val letter: Char = readLine()!![0]
    val text: String = readLine()!!
    val result = letter_count(letter, text)
    println(result)
}

fun letter_count(l: Char, t: String):Int{
    var result = 0
    for(count in t){
        if(count == l){
            result++
        }
    }
    return result
}