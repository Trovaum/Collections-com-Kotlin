package me.ricardo

fun main() {
    val values = IntArray(5)

    values[0] = 9
    values[1] = 5
    values[2] = 2
    values[3] = 8
    values[4] = 3

    // imprime os valores sem ordenação
    for (valor in values) {
        println(valor)
    }
    println("imprimeos valores com ordenação")
    values.sort()
    for (valor in values) {
        println(valor)
    }


}