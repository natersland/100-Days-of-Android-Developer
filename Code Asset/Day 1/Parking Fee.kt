fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    
    when{
        hours < 5 -> total = hours*1.0
        hours > 5 && hours < 24 -> total = ((hours-5)*0.5)+5.0
        hours >= 24 -> total = 15.0 * Math.floor(hours /24.0) + ((hours% 24.0)*0.5)
    }
    println(total)
} 