package controlDeErrores

fun main() {
  controlDeErrores()
}

private fun controlDeErrores() {
    val myArrayList = arrayListOf(1, 2, 3, 4, 5)


    try {
        for (position in 0..myArrayList.size) {
            print("${myArrayList[position]} ")
        }


    } catch (exception: IndexOutOfBoundsException) {
        println("\nHa habido un error: ${exception.message}")
        exception.printStackTrace()
    }
}