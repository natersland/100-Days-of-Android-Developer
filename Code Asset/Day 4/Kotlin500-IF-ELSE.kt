fun main(args: Array<String>) {
    // 1
    fun isOddOrEven(num: Int) {
        if (num % 2 == 0) {
            println("$num is even")
        } else {
            println("$num is odd")
        }
    }
    isOddOrEven(5)
    // 2
    fun isGreaterThanZero(num: Int) {
        if (num > 0) {
            println("$num is greater than 0")
        } else {
            println("$num is less than 0")
        }
    }
    isGreaterThanZero(5)
    // 3
    fun zeroChecker(num: Int) {
        if (num > 0) {
            println("$num is positive")
        } else if (num < 0) {
            println("$num is negative")
        } else {
            println("$num is zero")
        }
    }
    zeroChecker(0)
    zeroChecker(50)
    zeroChecker(-6)

    // 4
    fun zeroCheckerV2(num: Int) {
        // check even-odd
        var numStatus: String

        if (num % 2 == 0) {
            numStatus = "even"
        } else {
            numStatus = "odd"
        }
        // check pos-nag
        if (num > 0) {
            println("$num is positive $numStatus")
        } else if (num < 0) {
            println("$num is negative $numStatus")
        } else {
            println("$num is zero $numStatus")
        }
    }
    zeroCheckerV2(4)

    //5
    fun square(){
        var status = true
        do {
            println("Width: ")
            val width = readLine()!!.toInt()
            println("Height: ")
            val height = readLine()!!.toInt()
            if(width > 0 || height > 0){
                println("Square: ${width*height}")
                status = false
            } else {
                println("Please insert number again")
            }
        } while (status)
    }
      square()

      //6
      fun yearCalc(){
        var status2 = true
        do {
            println("AD Year: ")
            val yearAD = readLine()!!.toInt()
            if(yearAD >= 0){
                println("BC year is: ${yearAD+543}")
                status2 = false
            } else {
                println("Please insert number greater than 0 or equal 0")
            }
        }
            while (status2)
  
    }
      yearCalc()

      //7
      fun falenTocels(){
        println("Falen Temp: ")
        val falen = readLine()!!.toInt()
        if (falen >= 32){
            println("Celcuis is: ${(5*(falen-32))/9}")
        } else {
            println("cold")
        }
    }
      falenTocels()
}
