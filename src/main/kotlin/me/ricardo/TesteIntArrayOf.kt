package me.ricardo

fun main() {
    val values = intArrayOf(9, 2, 6, 8, 11)

    println("Array sem modificação")
    values.forEach {
        println(it)
    }
    println("Array com ordenção")
    values.sort()
    values.forEach {
        println(it)
    }
}