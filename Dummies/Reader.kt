import java.io.FileReader

fun main() {
    var fileData: List<String>? = null
    try {
        var reader = FileReader("writer_test.txt")
        fileData = reader.readLines()
    } catch (e: Exception){
        println("Error: $e")
    }finally {
        println("Read Successfully!")
    }

    if (fileData != null){
        for (line in fileData){
            line?.let {println(line)}
        }
    }
}