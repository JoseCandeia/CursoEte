//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    nome()
//    doudle()
//    quadrado()
//    dobro()
//    anteSuc()
//    dias()
//    notas()
//    conversao()
//    desconto()
//    operadaores()
//    maioridade()


}
fun nome() {
    println("Infome seu nome: ")
    val nome = readLine().toString()
    val recebe = "ola, "+ nome

    println(recebe)
}
fun doudle(){
    val a = 20.5
    val b = 10.4
    val soma = a + b
    println(soma)
}

fun quadrado(){

    val a = 2
    val quadrado = 2 * a

    println(quadrado)
}

fun dobro(){
    val a = 2
    val dobro = 2 * a

    println(dobro)

}

fun anteSuc(){

    val num1 = 5
    val sucessor = num1 +1


    val num2 = 6
    val anetecessor = num2 - 1
}

fun dias(){
    val dia = 30
    val mes = 7

    val valor = dia * mes
    println("O total de dias são: " + valor + "dias")

}
fun notas(){

    val n1 = 5
    val n2= 2
    val n3 = 10
    val n4 = 7
    val n5 = 6

    val soma = n1 + n2 + n3  + n4 + n5

    val media = soma /2

}

fun conversao(){

    val metro = 5
    val cent = 100

     val conv = metro * cent

    println(conv)
}


fun desconto(){

    val desc = 0.2
    val preco = 50

    val res =  desc * preco
    println(res)
}

// nivel 2

fun operadaores(){
    val soma = 40 + 50
    val sub = 10 -5
    val mult = 5 *3
    val div = 10 /2
     println(soma)
    println(sub)
    println(mult)
    println(div)


}
fun maioridade(){
    println("Infome sua idade: ")
    val nome = readLine().toString().toInt()
    if (nome > 18){
        println("voce é maior de idade")

    }
    else {
       println("menor de idade")
    }
}