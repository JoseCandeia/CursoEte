fun main(){
retangulo()
    quadrado()
    raio()
    triangulo()
    sucessor()
    divisao()
   // idade()
    conversao()
}

fun retangulo(){

    val base = 5
    val alt = 12
 val per = 2*(base * alt)
    val area = (base * alt)/2

    println( "A aréa é: " + area )
    println(" e o perimetro é: " + per )
}
fun quadrado(){
    val lado = 2
    val area = lado *2
    val per = 4 * lado
    println("A areia do quadrado é: " + area)
    println("O perimetro do quadrado é: " + per)

}
fun raio(){

    val pi =3.14
    val raio =5

    val area = pi*(raio *2)
    val per = 2*pi *raio
    println("A area do raio é: "+area)
    println( "O perimetro do raio da circuferencia é: "+ per)

}
fun triangulo(){
    val base =2
    val alt =5
    val lado = 3
     val area = (base * alt )/2
     val per =  3* lado
    println("A area do triangulo é: " + area)
    println("O perimetro do Triangulo é: " + per)
}
fun sucessor(){
    val num1 = 5
    val res = num1 +1
    println(res)
}
fun divisao(){
    val numerador = 4
    val divisor = 2
    val result = numerador / divisor
    val resto = numerador % divisor
    println(" O resultado é: " + result)
    println("O resto da divisão é: "+ resto)
}
fun idade(){
    println("Informe sua idade : ")
    val idade = readLine()!!.toInt()
    val dia = idade * 365
    val meses = dia /30
    val ano = meses /12
    println("Você tem "+ ano +" anos " + meses +" meses " + dia + " dias")

}
fun conversao(){
    //C = (77 - 32) * 5/9 = 45 * 5/9 = 25
    println("Informe a terperatura em Fahrenheit: ")
    val temp = readLine()!!.toInt()
    val res =  (temp -32)*5/9
    println("O resultado em °C é "+ res+"°C")
}