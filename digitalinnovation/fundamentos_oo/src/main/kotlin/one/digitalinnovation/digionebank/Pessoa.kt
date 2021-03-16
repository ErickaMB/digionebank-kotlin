package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ericka"
    var cpf: String = "123.123.123-12"

}

fun main() {
    val ericka = Pessoa()

    println(ericka.nome)
    println(ericka.cpf)
}