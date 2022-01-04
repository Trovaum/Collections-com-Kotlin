package me.ricardo

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
) {
    override fun toString(): String {
        return "Funcionario(nome='$nome', salario=$salario)"
    }
}

