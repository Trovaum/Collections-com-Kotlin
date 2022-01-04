package me.ricardo

fun main() {
    val salarios = DoubleArray(2)
    salarios[0] = 100.10
    salarios[1] = 2030.40

    println("Estudo com DoubleArray")
    for (salario in salarios){
        println(salario)
    }
}