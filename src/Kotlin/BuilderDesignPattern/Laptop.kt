package Kotlin.BuilderDesignPattern

class Laptop(builder: Builder) {
    var processor = builder.processor
    var ram: String = builder.ram
    var battery: String = builder.battery
    var screenSize: String = builder.screenSize
    override fun toString(): String {
        return "$processor \n $ram \n $battery \n $screenSize \n"
    }

    class Builder(name: String) {
        var processor = name
        var ram: String = "2gb"
        var battery: String = "5000mAH"
        var screenSize: String = "15inch"
        fun setRam(ram: String): Builder {
            this.ram = ram
            return this
        }

        fun setBattery(battery: String): Builder {
            this.battery = battery
            return this
        }

        fun setScreenSize(size: String): Builder {
            this.screenSize = screenSize
            return this
        }

        fun build(): Laptop {
            return Laptop(this)
        }
    }
}