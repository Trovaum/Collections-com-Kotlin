package me.ricardo

fun main() {
    val salarios = doubleArrayOf(1200.10, 1440.30, 960.40)

    for (salario in salarios) println(salario)

    println("operação com array, Media dos valores: ${salarios.average()}")
    println("operação com array, maximo dos valores: ${salarios.maxOrNull()}")
    println("operação com array, Menor dos valores: ${salarios.minOrNull()}")
    println("operação com array, valores dentro de um range: ${salarios.count { it in 100.0..5000.0 }}")
    println("operação com array, encontra um valor igual: ${salarios.find { it == 960.40}}")
    println("operação com array, encontra um valor igual e retorna boolean: ${salarios.any { it == 1440.30}}")

    println("Filter na operação")
    val salarioMaiorQue1000 = salarios.filter { it > 1000.0 }
    println(salarioMaiorQue1000)
}
