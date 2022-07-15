fun main(args: Array<String>) {
    val price = readLine()!!.toDouble()
    calc(price)
}

fun calc(p:Double){
    println(p*0.15+p)
    
}