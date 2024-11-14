package org.example.operadores

fun main() {
    operadores()
    operadoresComparacion()
}


val firstValue = 5.0
val secondValue = 2.0
val name = "Carlos"
val age = 37

// Operadores Aritmeticos
private fun operadores() {
    val suma = firstValue + secondValue
    println("Resultado suma: $suma")
    val resta = firstValue - secondValue
    println("Resultado resta: $resta")
    val multiplicacion = firstValue * secondValue
    println("Resultado multiplica: $multiplicacion")
    val division = firstValue / secondValue
    println("Resultado division: $division")
    val resto = firstValue % secondValue
    println("Resultado resto: $resto")
}

// Operadores de Comparacion
private fun operadoresComparacion() {
    val igualdad = firstValue == secondValue //infiere que el tipo de dato es boolean ya que compara los dos números y devuelve true o false
    println("¿Son iguales?: $igualdad")

    val desigualdad = firstValue != secondValue
    println("¿Son desiguales?: $desigualdad")

    val menor = firstValue < secondValue
    println("¿El primer número es menor que el segundo? $menor")

    val mayor = firstValue > secondValue
    println("¿El primer número es mayor que el segundo? $mayor")

    //operadores lógicos:
    val igualdad2 = name == "Carlos"
    println("¿Se llama Carlos? $igualdad2")


    val menorQue2 = firstValue < 2
    println("¿El primer valor es menor que 2? $menorQue2")

    val mayorQue2 = firstValue > 2
    println("¿El primer valor es mayor que 2? $mayorQue2")

    val conjuncion = igualdad2 && menorQue2
    println("¿Se cumplen las dos igualdades? $conjuncion")

    val conjuncion2 = igualdad2 && mayorQue2
    println("¿Se cumplen las dos igualdades? $conjuncion2")

    val disyuncion = igualdad2 || menorQue2
    println("¿Se cumple alguna de las dos condiciones? $disyuncion")

    val negacion = !igualdad2
    println("el resultado de igualdad2 que en origen es verdadero, le hemos dado la vuelta: $negacion")







}


