package bucles.`for`

fun main() {
bucleFor()
}

private fun bucleFor() {

    val myArrayList = arrayListOf("Rodrigo", "Carlos", "Lorena", "David", "Allison")

    for (persona in myArrayList) {
        print("$persona ")
    }

    println()//salto de linea

    for (position in 0 until 5) { //de cero hasta 5
        print("$position ")
    }

    println()//salto de linea

    for (position in 0..10 step 2) { //aquí queremos que imprima cada dos posiciones, si quisieramos tres pues 3... y así sucesivamente
        print("$position ")
    }

    println()//salto de linea

    for (position in 10 downTo 3 step 2) { //aquí empezaría por el 10 y bajaría hasta el 3 con saltos de dos
        print("$position ")
    }
}

