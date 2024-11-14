package nullSafety

fun main() {
    nullSafety()
}

private fun nullSafety() {
    // Declaramos una variable nullable (que puede contener un valor nulo) con el tipo String.
    val nullString: String? = null

    // Verificamos si nullString no es nula antes de imprimir su valor.
    if (nullString != null) {
        println("El resultado es nulo: $nullString")
    }

    // Usamos el operador seguro de llamada (?.) y let para ejecutar el bloque solo si nullString no es nula.
    // Si nullString tiene un valor, se imprime. Si es null, el bloque no se ejecuta.
    nullString?.let { println("El resultado es nulo: $nullString") }

    // Usamos el operador seguro de llamada (?.) junto con let y el operador Elvis (?:) para manejar ambos casos:
    // - Si nullString no es nula, se ejecuta let e imprime el valor de nullString.
    // - Si nullString es nula, se ejecuta el bloque run, imprimiendo el mensaje desde ahí.
    nullString?.let { println("El resultado es nulo: $nullString") } ?: run { println("El resultado es nulo: $nullString") }

}



