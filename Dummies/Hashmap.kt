fun main() {
    // hashmap
    var hashMapFantasy = HashMap<String,String>()
    hashMapFantasy.put("cat", "sunny")
    hashMapFantasy.put("lung", "submarine")

    println(hashMapFantasy.get("lung"))
    println(hashMapFantasy["cat"])

    for (key in hashMapFantasy.keys){
        println("key: $key -> value: ${hashMapFantasy[key]}")
    }
}