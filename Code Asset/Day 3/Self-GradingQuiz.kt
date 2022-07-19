fun main(){
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below

    // Creating Quiz Questions
    println("What is 75 / 5?")
    val studentAnswer1 = Integer.valueOf(readLine())
    println("the value of y in the equation: 6 * 2y = 36")
    val studentAnswer2 = Integer.valueOf(readLine())
    println("name the type of triangle that has two equal sides")
    val studentAnswer3 = readLine()
    println("the value of 8 * 6 - (3 - 2)")
    val studentAnswer4 = Integer.valueOf(readLine())

    // Grading the Quiz
    var points:Int = 0
    //Q1
    if(studentAnswer1 == quizAnswer1){
        points += 25
    }
    //Q2
    if(studentAnswer2 == quizAnswer2){
        points += 25
    } else if(studentAnswer2 == quizAnswer2 +1 || studentAnswer2 == quizAnswer2 -1) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")} else {
        points += 1
    }
    //Q3
    if(studentAnswer3 == quizAnswer3){
        points += 25
    } else if(studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }
    //Q4
    if(studentAnswer4 == quizAnswer4){
        points += 25
    } else if(studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }


    when(points){
        in 0..59 -> println("the student received an F.")
        in 60..69 -> println("the student received an D.")
        in 70..79 -> println("the student received an C.")
        in 80..89 -> println("the student received an B.")
        in 90..100 -> println("the student received an A.")
        in 101..110 -> println("the student received an A+.")
    }
}

