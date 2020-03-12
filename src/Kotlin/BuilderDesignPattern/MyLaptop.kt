package Kotlin.BuilderDesignPattern

fun main(args: Array<String>) {
    var mylaptop = Laptop.Builder("Lenovo").setBattery("7000 mAh").build()
    print(mylaptop.toString())
}