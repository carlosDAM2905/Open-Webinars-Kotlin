package funciones

fun main() {
funciones()
}


//vamos a declarar una función:
private fun funciones() {

    funcionSimple()
    funcionParametros("Pepe", 25)

    //función con retorno:
    val calculaEdad = funcionRetorno(1987)
    println("mi age is: $calculaEdad")
}

//funcion simple:
private fun funcionSimple() {
    val nombre = "Carlos"
    val edad = 37

    println("mi nombre es: $nombre")
    println("mi edad es: $edad")
}

//funcion con parametros:
private fun funcionParametros(nombre: String, edad: Int) {
    println("mi nombre es: $nombre")
    println("mi edad es: $edad")
}

// La siguiente función calcula y devuelve la edad basada en el año de nacimiento proporcionado.
// Recibe un parámetro:
// - birthYear: Int - el año de nacimiento de la persona.
// La función devuelve un valor de tipo Int, que representa la edad calculada.
private fun funcionRetorno(birthYear: Int): Int = 2024 - birthYear
// El cálculo de la edad se hace restando el año de nacimiento del año actual (2024).
// La función usa la sintaxis de expresión para retornar el resultado directamente.



