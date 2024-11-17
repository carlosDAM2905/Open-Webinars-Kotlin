package reto2

import javax.xml.crypto.Data

/*
1.- Crear una función que se llame botDeSeguridad() y llamarla desde nuestro método onCreate().

2.- Crear una clase de datos llamada Persona.

Reglas:
1.- La clase de datos debe incluir tres constantes llamadas name, age y hobbies (que es un listado de strings).

2.- Creamos una variable de tipo Persona con nuestra información (nombre, edad y un listado de hobbies).

3.- Mediante el uso de condicionales, nuestro bot debe:
    - Mostrarnos un mensaje de error en caso de que el nombre que tenga la clase Persona no sea el nuestro
      y no dejarnos acceder, o de lo contrario, mostrar el mensaje de éxito y continuar.
    - Manejar los siguientes rangos de edad:
        - En caso de que tengamos entre 0 y 17 años, el bot nos dirá que somos menores de edad y que por tanto
          acceso denegado.
        - En caso de tener entre 65 y 100 nos diría lo mismo pero por ser demasiado mayores.
        - Si tenemos entre 18 y 64 años, dejarnos pasar y mostrar un mensaje de éxito.
    - Por último, recorrer con un bucle nuestros hobbies y mostrarlos por pantalla.
*/


fun main() {

    val hobbiesList = arrayListOf<String>("programar", "leer", "cine", "cocina")
    val persona = Persona("Carlos", 18, hobbiesList)
    botDeSeguridad(persona)
}

private fun botDeSeguridad(persona: Persona) {
    if (persona.name == "Carlos") {
        println("Hola ${persona.name}!")

        when(persona.age) {
            in 0..17 -> println("Access denied: ${persona.name} es menor de edad")
            in 65..100 -> println("Access denied: ${persona.name} es muy mayor")
            in 18..64 -> {
                println("Success: ${persona.name} es correcto\nHobbies:")
                for (hobbie in persona.hobbies) {
                    print("$hobbie  ")
                }
            }
        }
    } else {
        println("El nombre: ${persona.name} no es correcto")
    }
}

data class Persona (
    val name: String,
    val age: Int,
    val hobbies: ArrayList<String>
)

