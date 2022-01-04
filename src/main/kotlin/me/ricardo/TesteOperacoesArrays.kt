package me.ricardo

fun main() {
    val salarios = doubleArrayOf(1200.10, 1440.30, 960.40)

    for (salario in salarios) println(salario)

    println("operação com array, Media dos valores: ${salarios.average()}")

    println("Filter na operação")
    val salarioMaiorQue1000 = salarios.filter { it > 1000.0 }
    println(salarioMaiorQue1000)
}
