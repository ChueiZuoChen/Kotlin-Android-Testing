package com.example.kotlinandroidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RollUpTest{
    /**
     * Return the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-1) + fib(n-2)
     * */
    @Test
    fun `input 0 return 0`(){
        val result = RollUp.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `input 1 return 1`(){
        val result = RollUp.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `input 2 return 1`(){
        val result = RollUp.fib(2)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `input 3 return 2`(){
        val result = RollUp.fib(3)
        assertThat(result).isEqualTo(2)
    }

    /**
     * checks if the braces are set correctly
     * e.g. "(a*b))" should be return false
     * */

    @Test
    fun `input "(a * b))" return false`(){
        val result = RollUp.checkBraces("(a*b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `input "()(()))" return false`(){
        val result = RollUp.checkBraces("()(()))")
        assertThat(result).isFalse()
    }

    @Test
    fun `input ")(()" return true`(){
        val result = RollUp.checkBraces(")(()")
        assertThat(result).isTrue()
    }
}