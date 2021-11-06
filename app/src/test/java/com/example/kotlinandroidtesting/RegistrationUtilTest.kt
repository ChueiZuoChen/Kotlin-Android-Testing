package com.example.kotlinandroidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test


/**
 * the input is not invalid if ...
 * ... the username/password is empty
 * ... the username has already exists
 * ... the confirmed password is not the same as the real password
 * ... the password contains less than 2 digits
 * */

class RegistrationUtilTest{

    @Test
    fun `empty user name return false`(){
        val result = RegistrationUtil.validateRegistrationInput("","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput("someone","","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `username has already exits return false`(){
        val result = RegistrationUtil.validateRegistrationInput("Potti","123","123")
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirmed password is not the same return false`(){
        val result = RegistrationUtil.validateRegistrationInput("Potti","123","345")
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digit return false`(){
        val result = RegistrationUtil.validateRegistrationInput("Potti","1aa","1aa")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeat password return true`(){
        val result = RegistrationUtil.validateRegistrationInput("chen","333","333")
        assertThat(result).isTrue()
    }
}