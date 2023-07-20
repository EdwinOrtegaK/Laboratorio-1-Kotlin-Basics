package Exercise3

fun primerCaracterNoRepetitivo(cadena: String): Int {
    val charFrequencies = mutableMapOf<Char, Int>()

    // Contar la frecuencia de cada carácter en la cadena
    for (char in cadena) {
        charFrequencies[char] = charFrequencies.getOrDefault(char, 0) + 1
    }

    // Encontrar el primer carácter no repetitivo
    for ((index, char) in cadena.withIndex()) {
        if (charFrequencies[char] == 1) {
            return index
        }
    }

    // Si no se encuentra ningún carácter no repetitivo
    return -1
}

fun main() {
    val cadena = "abcdcaf"
    val resultado = primerCaracterNoRepetitivo(cadena)
    println(resultado) // Output: 1
}
