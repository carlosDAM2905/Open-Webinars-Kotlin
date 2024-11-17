package listados

fun main() {
listados()
}

private fun listados() {

    val arrayList = arrayListOf<String>()
    val arrayList2: ArrayList<String> = arrayListOf()

    val myList = listOf("Rodrigo", "Carlos", "Lorena", "David", "Allison")
    val myArrayList = arrayListOf("Rodrigo", "Carlos", "Lorena", "David", "Allison")

    val listItem = myList[2]

    myArrayList[2] = "Sandra"
    val arrayListItem = myArrayList[2]

    //borrar un item dentro del Arraylist:

    myArrayList.remove("Sandra") //borramos directamente un item por su contenido
    myArrayList.removeAt(3) //lo mismo pero borramos lo que contiene la posición del array que marcamos

    //myArrayList.clear() //borra todo lo que contiene el listado

    //myArrayList.addAll(myList) //añade otro listado al listado

    myArrayList.sortBy { it -> it.length } //ordena por la longitud de cada elemento


    println(myArrayList.toString())

}