package Kotlin.SingleTonDesignPattern

object SingleTon:A() {

    init {
        println("SingleTon is initialised")
    }

    fun show() {
        println("Hello world")
    }
}