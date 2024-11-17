package bucles.dowhile

fun main() {
    bucleDoWhile()
}

private fun bucleDoWhile() {

    var myNumber = 11

    do {
        println("He entrado en el bucle do")
        myNumber++
    } while (myNumber <= 10)

    //el ejemplo anterior imprime una sola vez "He entrado en el bucle do" porque inicialmente myNumber = 11, entonces imprime la primera vez ya que no comprueba la condicion while, una vez imprime el mensaje, incrementa myNumber en 1 con myNumber++ y una vez comprueba la condición que hemos puesto while (myNumber <= 10), sale del bucle ya que ahora la variable myNumber vale 12 y por tanto es mayor a 10
}