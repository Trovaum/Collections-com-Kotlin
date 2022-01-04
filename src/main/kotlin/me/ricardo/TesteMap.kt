package me.ricardo

fun main() {
    val pair = Pair<String, Double>("Ricardo", 10390.0)
    val mapping = mapOf(pair)

    mapping.forEach { ( k, v) -> println("Chave: $k valor: $v") }

    val mapping2 = mapOf("Enzo" to 3500.0, "Renan" to 2030.40)
    mapping2.forEach { ( k, v) -> println("Chave: $k valor: $v") }
}