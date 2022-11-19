fun main() {
    println("\n\n\n\n\n\n\nGib eine Rechnung ein!")

    print("1. Wert: ")

    val a = readLine()!!.toLong()

    print("2. Wert: ")

    val b = readLine()!!.toLong()

    println("Die Rechnung lautet: $a + $b")

    println("Gib das Ergebnis ein")

    print("> ")

    val e = readLine()!!.toLong()

    val result = a + b

    if (result == e) {
        println("Juhu, du hast richtig gerechnet!")
    } else {
        println("Uje, du hast kaka gerechnet! Das richtige Ergebnis lautet $result")
    }
}

