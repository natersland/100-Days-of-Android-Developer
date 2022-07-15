fun shippingCost(amount: Double, international: Boolean): Double {
    var shippingFee = 0.0
    if(!international){
        if(amount < 75){
            shippingFee = amount*0.10
        }
    } else {
        if(amount*0.15 > 50){
            shippingFee = 50.0
        } else {
            shippingFee = amount*0.15
        }
    }
    return shippingFee
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))
}