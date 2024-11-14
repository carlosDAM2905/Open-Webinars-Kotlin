package reto1

/*
1.- Crear una clase Programador
2.- Crear una interfaz llamada ProgramadorInterface
3.- Crear una clase de datos llamada ProgrammerData

Reglas:
1.- La clase de datos debe incluir tres constantes llamadas name, age y language
2.- La interfaz debe tener un método llamado getProgrammerData(), que devolverá un objeto de tipo ProgrammerData
3.- La clase Programador debe implementar la interfaz y se debe:
   - Crear tres funciones privadas que se encarguen de devolver un nombre, edad y lenguaje de programación respectivamente a vuestra elección
   - La función getProgrammerData debe devolver un objeto de tipo ProgrammerData con los datos de las tres funciones privadas creadas anteriormente
4.- Si cuando llamemos a la clase, solo podemos acceder al método getProgrammerData, es que lo hemos hecho bien
 */

fun main() {
    logica()
}

fun logica() {
    val programador = Programador().getProgrammerData()
    println("Nombre: ${programador.name} | Edad: ${programador.age} | Lenguaje: ${programador.language}")
}


class Programador() : ProgramadorInterface {
    override fun getProgrammerData(): ProgrammerData {
        val programador = ProgrammerData(getName(), getAge(), getLanguage())
        return programador
    }

    private fun getName(): String = "Carlos"
    private fun getAge(): Int = 37
    private fun getLanguage(): String = "Kotlin"

}

interface ProgramadorInterface {
    fun getProgrammerData(): ProgrammerData
}

data class ProgrammerData(
    val name: String,
    val age: Int,
    val language: String,
)
