package me.ricardo

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Enzo"
    nomes[1] = "João"
    nomes[2] = "Ana"

    println("Array de strings sem ordenação")
    for (nome in nomes){
        println(nome)
    }
    println("Array de strings com ordenação")
    nomes.sort()
    for (nome in nomes){
        println(nome)
    }

    println("Outra forma de declarar um array strings sem ordenação")
    val nomes2 = arrayOf("Ricardo", "Renan", "Enzo")
    for (nome in nomes2){
        println(nome)
    }
    println("array strings com ordenação")
    nomes2.sort()
    for (nome in nomes2){
        println(nome)
    }
}