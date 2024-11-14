package interfaces

import clases.DatosPersona

fun main() {
    interfaces()
}

fun interfaces() {
    val carlosData = DatosPersona("Carlos", 37)
    val carlos = Persona(carlosData)
    carlos.presentacion()
    val edad = carlos.returnAge(1987)
    println("My age is: $edad")

}


data class DatosPersona (
    val name: String?,
    val age: Int
)

class Persona(private val data: DatosPersona) : Persona.interfacePersona {

    fun presentacion() {
        println("My name is ${data.name} and my age is ${data.age}")
    }


    override fun returnAge(birthYear: Int): Int = 2024 - birthYear

    interface interfacePersona {
        fun returnAge(birthYear: Int): Int
    }
}

