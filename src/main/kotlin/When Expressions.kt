fun main() {
    val value = 7
    val StringOfValue = when(value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "Value is 8"
        }
        else -> {
            println("undefined")
            "value vannot be reached"
        }
    }

    println(StringOfValue)
}