fun main() {
    // Array
    var arr = Array<String>(6){"n"}

    arr[0] = "B"
    arr[2] = "42144"

    for (item in 0..arr.size-1){
        println(arr[item])
    }

    // Array List
    var arrList = ArrayList<String>()
    arrList.add("545454")
    arrList.add("4242")
    arrList.add("42427272")
    arrList.add("87687687")

    println(arrList)
    arrList.remove("87687687")
    println(arrList)
    println(arrList.get(2))

    if(arrList.contains("4242")){
        println("hi")
    }
}