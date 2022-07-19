/* #1 Write a for loop that runs from 0 to 10000
Once it's at 9001 it should write "IT'S OVER 9000!!!" */

fun main(){
    for (num in 0 until 10000){
        if (num >= 9000){
            println("It's OVER 9000!!!")
        }
    }
}

/* #2 Write a while loop that checks the humidity (not the humidityLevel). 
The variable humidityLevel starts at 80. The variable humidity is initialized with "humid". 
If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"*/

fun humidityLevel(){
    var humidityLevel  = 80
    while (humidityLevel >0){
        if (humidityLevel > 60){
            println("Status: humid")
            humidityLevel -= 5
            println("humidity decreased -5")
        } else {
            println("it's comfy now")
            println("comfy")
            break
        }
    }
}