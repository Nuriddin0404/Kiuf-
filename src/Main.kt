fun main() {
    println("Birinchi sonni kiriting:")
    val num1 = readLine()?.toIntOrNull()

    println("Ikkinchi sonni kiriting:")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        println("Amalni tanlang: (1) Qo'shish, (2) Ayirish")
        val choice = readLine()

        when (choice) {
            "1" -> println("Natija: ${num1 + num2}")
            "2" -> println("Natija: ${num1 - num2}")
            else -> println("Noto'g'ri tanlov!")
        }
    } else {
        println("Sonlarni noto'g'ri kiritdingiz.")
    }
}
