//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("Hello,Word")
   soma()
    sub()
    mult()
    divi()
    triangulo()
    conversao()
    parImpar()
    fatorial()
}
fun soma (){
    val num1 =3
    val num2 =6
   val soma = num1 +num2

    println("soma"+soma)
}
fun sub(){
    val num1 = 10
    val num2 = 5

    val sub = num1 - num2
    println("subtração"+sub)
}
fun mult(){

    val num1 =20
    val num2 =30
     val mult = num1 *num2
    println("multiplicação"+mult)
}
fun divi(){
    val num1 =50
    val num2 =5
    val divi = num1 / num2
    println("divisao"+divi)
}
fun triangulo(){
    val base =10
    val alt = 20

    val area = (base * alt)/2
 println("area"+area)
}

fun conversao(){
    val celcius =15

    val conversao = (celcius * 9/5) + 32
    println("Fahrenheit = " + conversao)
}
fun parImpar(){
    val num1 = 3
    val num2 =3

    if ( num1 % 2 == 0 ){
        print("$num1 "+" " +"par")
    }else{
        println("$num1 "+ " " +"impar")
    }
    if ( num2 % 2 == 0 ){
        print("$num2 "+" " +"par")
    }else{
        println("$num2 "+ " " +"impar")
    }
}
fun fatorial(){
    val fator = 5
   for ( fator <=1){
       println("$fator")
   }
}