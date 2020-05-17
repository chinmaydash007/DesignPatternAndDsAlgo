package KoltinPrograms

fun main() {
    var aqua=Aqua()
    aqua.length=23
    print(aqua.length)
}


data class Person(var name: String, var age: Int)

class Aqua {
    var length: Int
        get() = length
        set(value) {
            value/2
        }

}