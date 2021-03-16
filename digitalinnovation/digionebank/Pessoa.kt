package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ericka"

    var cpf: String = "123.123.123-12"
    private set

constructor()

fun pessoaInfo() =  "$nome e $cpf"

}





fun main() {
    val ericka = Pessoa()


    println(ericka.pessoaInfo())
}