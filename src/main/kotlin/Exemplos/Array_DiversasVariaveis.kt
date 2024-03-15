package Exemplos

fun main(args: Array<String>){
    val ListaMix = arrayListOf("Marcelo", true,  1, 3.14, 'm')

    for (item in ListaMix){
        if (item is String){
            println(item.toUpperCase())
        }else{
            println(item)
        }
    }
}