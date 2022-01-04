package me.ricardo

fun main() {
    val salarios = DoubleArray(2)
    salarios[0] = 100.10
    salarios[1] = 2030.40

    println("Estudo com DoubleArray")
    for (salario in salarios){
        println(salario)
    }

    println("Usando for each indexado para manipular cada item do array")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("Usando doubleArrayOf já criando os valores do array")
    val salario2 = doubleArrayOf(123.10, 440.20, 90.40, 600.80)
    salario2.sort()
    salario2.forEach { println(it) }
}