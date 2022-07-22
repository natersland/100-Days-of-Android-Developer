fun main() {
    var funcNumber = 1
    do {
        println("Select Program")
        funcNumber = readLine()!!.toInt()
    } while (funcNumber <=1)

    when(funcNumber){
        8 -> usdToThbConVerter()
        9 -> thbToUsdConverter()
        16 -> parkingCalculator()
    }
}

fun usdToThbConVerter(){
    println("Your money in USD: ")
    var wallet = readLine()!!.toInt()
    if(wallet > 0){
        println("${(wallet * 36.5)}")
    } else {
        println("You don't have money")
    }
}

fun thbToUsdConverter(){
    println("Your money in THB: ")
    var wallet = readLine()!!.toInt()
    if(wallet > 0){
        println("${(wallet / 36.5)}")
    } else {
        println("You don't have money")
    }
}
fun parkingCalculator(){
    println("Hour: ")
    var hours = readLine()!!.toInt()
    println("Minute: ")
    var minutes = readLine()!!.toInt()
    if (minutes > 0){
        hours++
    }
    if(hours > 1){
        println("${(hours-1)*30} Bath")
    } else {
        println("FREE PARKING!")
    }
}
