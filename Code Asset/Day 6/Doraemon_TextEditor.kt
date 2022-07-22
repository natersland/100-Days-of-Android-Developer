import java.io.FileReader
import java.io.FileWriter

fun main() {
    var status:Int = 1 // 1-Write, 2-Read, 3-Delete, 4-Exit

    do {
        println("Select the number for choose mode: (2-Write, 3-Read, 4-Delete, 5-Exit)")
        status = readLine()!!.toInt()
    }while (status <= 1 || status > 5)

    when(status){
        2 -> doraemonWrite()
        3 -> doraemonRead()
        4 -> doraemonDelete()
        5 -> println("Doraemon: Bye bye")
    }
}

fun doraemonWrite(){
    try {
        var doraemon_write = FileWriter("fantasy_text.txt", true)
        println("What do you want to tell Nobita?")
        var message = readLine()
        doraemon_write.write("$message\n")
        doraemon_write.close()
    } catch (e: Exception){
        println("Error: $e")
    } finally {
        println("Doraemon was wrote file successfully!")
    }
}

fun doraemonRead(){
    var fileData: List<String>? = null
    try {
        var doraemon_read = FileReader("fantasy_text.txt")
        fileData = doraemon_read.readLines()

        if(fileData != null){
            var i = 0
            for (line in fileData){
                line?.let { println("$i - $line") }
                i++
            }
        }

    }   catch (e: Exception){
            println("Error: $e")
        } finally {
            println("Doraemon was red file successfully!")
        }
}
fun doraemonDelete(){
    try {
        var doraemon_write = FileWriter("fantasy_text.txt")
        doraemon_write.write("")
        doraemon_write.close()
    } catch (e: Exception){
        println("Error: $e")
    } finally {
        println("Doraemon was deleted file successfully!")
    }
}