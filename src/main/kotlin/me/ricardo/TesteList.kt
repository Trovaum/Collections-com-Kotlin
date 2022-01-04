package me.ricardo

fun main() {
    val joao = Funcionario("João", 5000.0)
    val ricardo = Funcionario("Ricardo", 2000.0)
    val enzo = Funcionario("Enzo", 3000.0)

    val funcionarios = listOf(joao, ricardo, enzo)

    funcionarios.forEach { println(it) }
    println("Busca por nome usando metodo find: " + funcionarios.find { it.nome == "Enzo" })

    funcionarios.sortedBy { it.salario }.forEach { println("Usando ordenação por faixa salarial " + it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String {
        return "Funcionario(nome='$nome', salario=$salario)"
    }
}
