fun main(args: Array<String>) {

    //1
    var numeric1 = 5
    println("#1 ${numeric1::class.simpleName} | $numeric1")
    //2
    var numeric2 = -3
    println("#2 ${numeric2::class.simpleName} | $numeric2")
    //3
    var numeric3 = 0
    println("#3 ${numeric3::class.simpleName} | $numeric3")
    //4
    var inputInt = readLine()!!.toInt()
    println("#4 ${inputInt::class.simpleName} | $inputInt")
    //5
    var numric1:Float = 5.0f
    println("#5 ${numric1::class.simpleName} | $numric1")


    //6
    var numric2:Float = -3.1f
    println("#6 ${numric2::class.simpleName} | $numric2")
    //7
    var numric3:Float = 0.0f
    println("#7 ${numric3::class.simpleName} | $numric3")
    //8
    var inputInt2 = readLine()!!.toInt()
    println("#8 ${inputInt2::class.simpleName} | $inputInt2")
    //9
    var int1 = readLine()!!.toInt()
    var int2 = readLine()!!.toInt()
    println("#8 ${(int1+int2)::class.simpleName} | ${(int1+int2)}")
    //10
    var float1 = readLine()!!.toFloat()
    var float2 = readLine()!!.toFloat()
    println("#10.1 ${(float1+float1)::class.simpleName} | ${(float1+float1)}")
    println("#10.2 ${(float1-float1)::class.simpleName} | ${(float1-float1)}")
    println("#10.3 ${(float1*float1)::class.simpleName} | ${(float1*float1)}")
    println("#10.4 ${(float1/float1)::class.simpleName} | ${(float1/float1)}")


}
