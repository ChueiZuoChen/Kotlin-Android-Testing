package com.example.kotlinandroidtesting

object RegistrationUtil {

    private val users = listOf<String>("Czchen", "Potti")

    /**
     * the input is not invalid if ...
     * ... the username/password is empty
     * ... the username is already exists
     * ... the confirmed password is not the same as the real password
     * ... the password contains less than 2 digits
     * */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if (username.isEmpty() || password.isEmpty()){
            return false
        }
        if (username in users){
            return false
        }
        if (password!=confirmedPassword){
            return false
        }
        if (password.count{it.isDigit()} <= 2){
            return false
        }

        return true

    }

}