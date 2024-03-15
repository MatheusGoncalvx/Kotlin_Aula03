package Exemplos

//Matheus Gonçalves Lima

fun main (args: Array<String>){
    val pares = arrayListOf(2, 4, 6)
    val impares = arrayListOf(1, 3, 5)

    for (n in impares.union(pares).sorted()){
        print("$n" )
    }
}

//O método union() é usado para unir os elementos das duas linhas sem repetições de dados.
//O método sorted() ordena a lista em ordem crescente.