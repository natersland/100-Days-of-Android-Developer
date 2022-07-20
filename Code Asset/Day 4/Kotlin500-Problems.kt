fun main(args: Array<String>) {
    //1
    fun isOddOrEven(num: Int){
        if(num % 2 == 0){
            println("$num is even")
        } else {
            println("$num is odd")
        }
    }
    isOddOrEven(5)
    //2
    fun isGreaterThanZero(num: Int){
        if(num > 0){
            println("$num is greater than 0")
        } else {
            println("$num is less than 0")
        }
    }
    isGreaterThanZero(5)
    //3
    fun zeroChecker(num: Int){
        if(num > 0){
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

    //4
  fun zeroCheckerV2(num: Int){
    //check even-odd
    var numStatus: String

        if(num % 2 == 0){
            numStatus = "even"
        } else {
            numStatus = "odd"
        }
    if(num > 0){
        println("$num is positive $numStatus")
    } else if (num < 0) {
        println("$num is negative $numStatus")
    } else {
        println("$num is zero $numStatus")
    }
}
  zeroCheckerV2(4)
}