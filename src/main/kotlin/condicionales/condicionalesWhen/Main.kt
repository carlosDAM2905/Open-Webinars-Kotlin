package condicionales.condicionalesWhen

fun main() {
    condicionalesWhen()
}

private fun condicionalesWhen() {
    val language = "Kotlin"

    when (language) {
        "Kotlin", "Scala" -> {
            println("Se ha seleccionado Kotlin")
        }
        "Java" -> println("Se ha seleccionado Java")
        "Python" -> println("Se ha seleccionado Python")
        "Ruby" -> println("Se ha seleccionado Ruby")
        else -> println("Se ha seleccionado otro lenguaje")
    }

    val myNumber = 94
    when (myNumber) {
       in 0..10 -> {
            println("Se ha seleccionado Kotlin")
        }
        40 -> {
            println("Se ha seleccionado Java")
        }
        in 80..119 -> {
            println("Se ha seleccionado Python")
        }
        120 -> {
            println("Se ha seleccionado Ruby")
        }
        else -> println("Se ha seleccionado otro lenguaje")
    }
}