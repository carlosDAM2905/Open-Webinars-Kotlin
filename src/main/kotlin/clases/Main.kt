package clases

fun main() {
    clases()
}

private fun clases() {
    val carlosData = DatosPersona("Carlos", 37)
    val carlos = Persona(carlosData)

    carlos.presentacion() //aquí estamos llamando a la función de la clase que hemos creado

}

//declaramos una clase:
class Persona(private val data: DatosPersona) {

    fun presentacion() {
        println("My name is ${data.name} and my age is ${data.age}")
    }
}

//dataclass:
data class DatosPersona (
        val name: String?,
        val age: Int
)