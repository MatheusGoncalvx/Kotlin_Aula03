package Exemplos

//Método ToUpperCase retorna todas palavras em letras maiúsculas


fun main (args: Array<String>){
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for(item in strings){
        println(item.toUpperCase())
    }
}