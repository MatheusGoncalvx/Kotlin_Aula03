package Exemplos

//Criando a função para multiplicar
fun multiplicar(x: Int, y: Int): Int{
    return x * y
}

fun main(args: Array<String>){

    println("Digite o primeiro número: ")
    val x = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val y = readLine()!!.toInt()

    val resultado = multiplicar(x,y)

    println("O resultado da soma é  = $resultado")
}