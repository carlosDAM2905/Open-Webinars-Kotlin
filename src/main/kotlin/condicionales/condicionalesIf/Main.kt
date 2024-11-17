package condicionales.condicionalesIf

fun main() {
    condicionalesIf()
}

private fun condicionalesIf() {
    val firstNumber = 10
    val secondNumber = 5
    val booleanValue = false

    if (firstNumber < secondNumber) {
        println("Primera opción")

    } else if (booleanValue) {
        println("Segunda opción")

    } else {
        println("Tercera opción")
    }

    val edad: Int = if (!booleanValue) {
        17
    } else {
        26
    }

    println("Edad = $edad")

}