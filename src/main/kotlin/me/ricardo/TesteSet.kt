package me.ricardo

fun main() {
    val joao = Funcionario("João", 5000.0, "CLT")
    val ricardo = Funcionario("Ricardo", 2000.0, "PJ")
    val enzo = Funcionario("Enzo", 3000.0, "CLT")

    val funcionarios = setOf(joao, ricardo)
    val funcionario1 = setOf(enzo)
    val funcionario2 = setOf(ricardo)

    val resultUnion = funcionarios.union(funcionario1)

    println("União de 2 Sets: " + resultUnion)
    val funcionarios3 = setOf(joao, ricardo, enzo)
    val resultExclusao = funcionarios3.subtract(funcionario2)
    println("Excluir um Set da lista: " + resultExclusao)
}