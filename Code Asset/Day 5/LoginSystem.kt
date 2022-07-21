fun main(args: Array<String>) {
    fun LoginSystem(){
        val username_data = "testuserza007"
        val password_data = "1212312121"

        do {
            println("Username:")
            val userinput_username = readLine()
            println("Password:")
            val userinput_password = readLine()

            if(userinput_username == username_data){
                if (userinput_password == password_data){
                    println("Login Successful!")
                } else {
                    println("Wrong Password, Please try agian.")
                }
            }else {
                println("Wrong username, please try agian")
            }
        } while (userinput_username != username_data || userinput_password != password_data)
    }
    LoginSystem()
}