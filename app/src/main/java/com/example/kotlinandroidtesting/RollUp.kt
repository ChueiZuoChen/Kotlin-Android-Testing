package com.example.kotlinandroidtesting

object RollUp {

    /**
     * Return the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-1) + fib(n-2)
     * */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        return fib(n-1)+ fib(n-2)
    }

    /**
     * checks if the braces are set correctly
     * e.g. "(a*b))" should be return false
     * */

    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }
}