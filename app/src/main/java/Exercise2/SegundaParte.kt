package Exercise2

fun sunsetViews(edificios: IntArray, direccion: String): List<Int> {
    val n = edificios.size
    val output = mutableListOf<Int>()
    var maxHeight = 0

    if (direccion == "ESTE") {
        for (i in n - 1 downTo 0) {
            if (edificios[i] > maxHeight) {
                output.add(i)
                maxHeight = edificios[i]
            }
        }
    } else if (direccion == "OESTE") {
        for (i in 0 until n) {
            if (edificios[i] > maxHeight) {
                output.add(i)
                maxHeight = edificios[i]
            }
        }
    }

    return output.reversed() // Revertimos la lista para que los índices estén en orden ascendente.
}

fun main() {
    val edificios = intArrayOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direccionEste = "ESTE"
    val direccionOeste = "OESTE"

    println("Dirección ESTE: ${sunsetViews(edificios, direccionEste)}")
    println("Dirección OESTE: ${sunsetViews(edificios, direccionOeste)}")
}