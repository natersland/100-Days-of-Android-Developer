import java.io.FileWriter

fun main() {
    try {
        var writer = FileWriter("writer_test.txt", true)
        writer.write("Hi from fantasy writer\n")
        writer.close()
    } catch (e: Exception){
        println("Error: $e")
    } finally {
        println("Write File Completed")
    }

}